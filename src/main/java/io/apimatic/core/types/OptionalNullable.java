package io.apimatic.core.types;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.apimatic.core.utilities.LocalDateTimeHelper;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Class to encapsulate fields which are Optional as well as Nullable. It also
 * provides helper methods to create OptionalNullable generic type, and to
 * extract value from it.
 * @param <T> Type of the encapsulated field.
 */
public class OptionalNullable<T> {

    /**
     * Private store for encapsulated object's value.
     */
    private T value;

    private OptionalNullable(T value) {
        this.value = value;
    }

    /**
     * Converts this OptionalNullable into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "" + value;
    }

    /**
     * Creates an OptionalNullable instance with the provided value.
     * @param <T>   Type of the provided object.
     * @param value Value of the provided object.
     * @return {@link OptionalNullable} instance encapsulating given value.
     */
    public static <T> OptionalNullable<T> of(T value) {
        return new OptionalNullable<T>(value);
    }

    /**
     * Extracts the encapsulated value from the given OptionalNullable.
     * @param <T>              Type of the expected value.
     * @param optionalNullable OptionalNullable instance to get value.
     * @return Value of the extracted field.
     */
    public static <T> T getFrom(OptionalNullable<T> optionalNullable) {
        return (optionalNullable == null) ? null : optionalNullable.value;
    }

    /**
     * JsonSerializer for the {@link OptionalNullable} instance. It is used to
     * Serialize an {@link OptionalNullable} as its encapsulated object.
     */
    public static class Serializer extends JsonSerializer<OptionalNullable<Object>> {
        @Override
        public void serialize(OptionalNullable<Object> object, JsonGenerator jgen,
                SerializerProvider provider) throws IOException {
            jgen.writeObject(object.value);
        }
    }

    /**
     * A class to handle serialization of Unix Timestamps to DateTime objects.
     */
    public static class UnixTimestampSerializer extends JsonSerializer<OptionalNullable<Object>> {
        @SuppressWarnings("unchecked")
        @Override
        public void serialize(OptionalNullable<Object> object, JsonGenerator jgen,
                SerializerProvider provider) throws IOException {
            if (object.value instanceof List<?>) {
                jgen.writeObject(
                        LocalDateTimeHelper.toUnixTimestampLong((List<LocalDateTime>) object.value));
            } else if (object.value instanceof Map<?, ?>) {
                jgen.writeObject(LocalDateTimeHelper
                        .toUnixTimestampLong((Map<String, LocalDateTime>) object.value));
            } else {
                jgen.writeObject(LocalDateTimeHelper.toUnixTimestampLong((LocalDateTime) object.value));
            }
        }
    }

    /**
     * A class to handle serialization of Rfc1123 format strings to DateTime
     * objects.
     */
    public static class Rfc1123DateTimeSerializer extends JsonSerializer<OptionalNullable<Object>> {
        @SuppressWarnings("unchecked")
        @Override
        public void serialize(OptionalNullable<Object> object, JsonGenerator jgen,
                SerializerProvider provider) throws IOException {
            if (object.value instanceof List<?>) {
                jgen.writeObject(
                        LocalDateTimeHelper.toRfc1123DateTime((List<LocalDateTime>) object.value));
            } else if (object.value instanceof Map<?, ?>) {
                jgen.writeObject(LocalDateTimeHelper
                        .toRfc1123DateTime((Map<String, LocalDateTime>) object.value));
            } else {
                jgen.writeString(LocalDateTimeHelper.toRfc1123DateTime((LocalDateTime) object.value));
            }
        }
    }

    /**
     * A class to handle serialization of Rfc8601(Rfc3339) format strings to
     * DateTime objects.
     */
    public static class Rfc8601DateTimeSerializer extends JsonSerializer<OptionalNullable<Object>> {
        @SuppressWarnings("unchecked")
        @Override
        public void serialize(OptionalNullable<Object> object, JsonGenerator jgen,
                SerializerProvider provider) throws IOException {
            if (object.value instanceof List<?>) {
                jgen.writeObject(
                        LocalDateTimeHelper.toRfc8601DateTime((List<LocalDateTime>) object.value));
            } else if (object.value instanceof Map<?, ?>) {
                jgen.writeObject(LocalDateTimeHelper
                        .toRfc8601DateTime((Map<String, LocalDateTime>) object.value));
            } else {
                jgen.writeString(LocalDateTimeHelper.toRfc8601DateTime((LocalDateTime) object.value));
            }
        }
    }

    /**
     * A class to handle serialization of LocalDate objects to date strings.
     */
    public static class SimpleDateSerializer extends JsonSerializer<OptionalNullable<Object>> {
        @SuppressWarnings("unchecked")
        @Override
        public void serialize(OptionalNullable<Object> object, JsonGenerator jgen,
                SerializerProvider provider) throws IOException {
            if (object.value instanceof List<?>) {
                jgen.writeObject(LocalDateTimeHelper.toSimpleDate((List<LocalDate>) object.value));
            } else if (object.value instanceof Map<?, ?>) {
                jgen.writeObject(
                        LocalDateTimeHelper.toSimpleDate((Map<String, LocalDate>) object.value));
            } else {
                jgen.writeString(LocalDateTimeHelper.toSimpleDate((LocalDate) object.value));
            }
        }
    }
}