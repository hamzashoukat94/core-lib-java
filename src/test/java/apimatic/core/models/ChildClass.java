/*
 * OptionalAndNullableLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package apimatic.core.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.math.BigDecimal;
import java.util.List;
/**
 * This is a model class for ChildClass type.
 */
public class ChildClass
        extends ParentClass {
    private OptionalNullable<String> optionalNullable;
    private OptionalNullable<String> optionalNullableWithDefaultValue;
    private String optional;
    private String requiredNullable;
    private String required;
    private OptionalNullable<List<ChildClass>> childClassArray;

    /**
     * Default constructor.
     */
    public ChildClass() {
        super();
        required = "not nullable and required";
        optionalNullableWithDefaultValue = OptionalNullable.of("With default value");
    }

    /**
     * Initialization constructor.
     * @param  grandParentRequiredNullable  String value for grandParentRequiredNullable.
     * @param  grandParentRequired  String value for grandParentRequired.
     * @param  parentRequiredNullable  String value for parentRequiredNullable.
     * @param  parentRequired  String value for parentRequired.
     * @param  requiredNullable  String value for requiredNullable.
     * @param  required  String value for required.
     * @param  grandParentOptional  String value for grandParentOptional.
     * @param  mClass  Integer value for mClass.
     * @param  precision  Double value for precision.
     * @param  bigDecimal  BigDecimal value for bigDecimal.
     * @param  parentOptionalNullableWithDefaultValue  String value for
     *         parentOptionalNullableWithDefaultValue.
     * @param  parentOptional  String value for parentOptional.
     * @param  optionalNullable  String value for optionalNullable.
     * @param  optionalNullableWithDefaultValue  String value for optionalNullableWithDefaultValue.
     * @param  optional  String value for optional.
     * @param  childClassArray  List of ChildClass value for childClassArray.
     */
    public ChildClass(
            String grandParentRequiredNullable,
            String grandParentRequired,
            String parentRequiredNullable,
            String parentRequired,
            String requiredNullable,
            String required,
            String grandParentOptional,
            Integer mClass,
            Double precision,
            BigDecimal bigDecimal,
            String parentOptionalNullableWithDefaultValue,
            String parentOptional,
            String optionalNullable,
            String optionalNullableWithDefaultValue,
            String optional,
            List<ChildClass> childClassArray) {
        super(grandParentRequiredNullable, grandParentRequired, parentRequiredNullable,
                parentRequired, grandParentOptional, mClass, precision, bigDecimal,
                parentOptionalNullableWithDefaultValue, parentOptional);
        this.optionalNullable = OptionalNullable.of(optionalNullable);
        this.optionalNullableWithDefaultValue =
                OptionalNullable.of(optionalNullableWithDefaultValue);
        this.optional = optional;
        this.requiredNullable = requiredNullable;
        this.required = required;
        this.childClassArray = OptionalNullable.of(childClassArray);
    }

    /**
     * Internal initialization constructor.
     */
    protected ChildClass(String grandParentRequiredNullable, String grandParentRequired,
            String parentRequiredNullable, String parentRequired, String requiredNullable,
            String required, String grandParentOptional, OptionalNullable<Integer> mClass,
            OptionalNullable<Double> precision, OptionalNullable<BigDecimal> bigDecimal,
            OptionalNullable<String> parentOptionalNullableWithDefaultValue, String parentOptional,
            OptionalNullable<String> optionalNullable,
            OptionalNullable<String> optionalNullableWithDefaultValue, String optional,
            OptionalNullable<List<ChildClass>> childClassArray) {
        super(grandParentRequiredNullable, grandParentRequired, parentRequiredNullable,
                parentRequired, grandParentOptional, mClass, precision, bigDecimal,
                parentOptionalNullableWithDefaultValue, parentOptional);
        this.optionalNullable = optionalNullable;
        this.optionalNullableWithDefaultValue = optionalNullableWithDefaultValue;
        this.optional = optional;
        this.requiredNullable = requiredNullable;
        this.required = required;
        this.childClassArray = childClassArray;
    }

    /**
     * Internal Getter for OptionalNullable.
     * @return Returns the Internal String
     */
    @JsonGetter("Optional_Nullable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetOptionalNullable() {
        return this.optionalNullable;
    }

    /**
     * Getter for OptionalNullable.
     * @return Returns the String
     */
    public String getOptionalNullable() {
        return OptionalNullable.getFrom(optionalNullable);
    }

    /**
     * Setter for OptionalNullable.
     * @param optionalNullable Value for String
     */
    @JsonSetter("Optional_Nullable")
    public void setOptionalNullable(String optionalNullable) {
        this.optionalNullable = OptionalNullable.of(optionalNullable);
    }

    /**
     * UnSetter for OptionalNullable.
     */
    public void unsetOptionalNullable() {
        optionalNullable = null;
    }

    /**
     * Internal Getter for OptionalNullableWithDefaultValue.
     * @return Returns the Internal String
     */
    @JsonGetter("Optional_Nullable_With_Default_Value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetOptionalNullableWithDefaultValue() {
        return this.optionalNullableWithDefaultValue;
    }

    /**
     * Getter for OptionalNullableWithDefaultValue.
     * @return Returns the String
     */
    public String getOptionalNullableWithDefaultValue() {
        return OptionalNullable.getFrom(optionalNullableWithDefaultValue);
    }

    /**
     * Setter for OptionalNullableWithDefaultValue.
     * @param optionalNullableWithDefaultValue Value for String
     */
    @JsonSetter("Optional_Nullable_With_Default_Value")
    public void setOptionalNullableWithDefaultValue(String optionalNullableWithDefaultValue) {
        this.optionalNullableWithDefaultValue = OptionalNullable.of(optionalNullableWithDefaultValue);
    }

    /**
     * UnSetter for OptionalNullableWithDefaultValue.
     */
    public void unsetOptionalNullableWithDefaultValue() {
        optionalNullableWithDefaultValue = null;
    }

    /**
     * Getter for Optional.
     * @return Returns the String
     */
    @JsonGetter("Optional")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOptional() {
        return optional;
    }

    /**
     * Setter for Optional.
     * @param optional Value for String
     */
    @JsonSetter("Optional")
    public void setOptional(String optional) {
        this.optional = optional;
    }

    /**
     * Getter for RequiredNullable.
     * @return Returns the String
     */
    @JsonGetter("Required_Nullable")
    public String getRequiredNullable() {
        return requiredNullable;
    }

    /**
     * Setter for RequiredNullable.
     * @param requiredNullable Value for String
     */
    @JsonSetter("Required_Nullable")
    public void setRequiredNullable(String requiredNullable) {
        this.requiredNullable = requiredNullable;
    }

    /**
     * Getter for Required.
     * @return Returns the String
     */
    @JsonGetter("Required")
    public String getRequired() {
        return required;
    }

    /**
     * Setter for Required.
     * @param required Value for String
     */
    @JsonSetter("Required")
    public void setRequired(String required) {
        this.required = required;
    }

    /**
     * Internal Getter for ChildClassArray.
     * @return Returns the Internal List of ChildClass
     */
    @JsonGetter("Child_Class_Array")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<ChildClass>> internalGetChildClassArray() {
        return this.childClassArray;
    }

    /**
     * Getter for ChildClassArray.
     * @return Returns the List of ChildClass
     */
    public List<ChildClass> getChildClassArray() {
        return OptionalNullable.getFrom(childClassArray);
    }

    /**
     * Setter for ChildClassArray.
     * @param childClassArray Value for List of ChildClass
     */
    @JsonSetter("Child_Class_Array")
    public void setChildClassArray(List<ChildClass> childClassArray) {
        this.childClassArray = OptionalNullable.of(childClassArray);
    }

    /**
     * UnSetter for ChildClassArray.
     */
    public void unsetChildClassArray() {
        childClassArray = null;
    }

    /**
     * Converts this ChildClass into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChildClass [" + "requiredNullable=" + requiredNullable + ", required=" + required
                + ", optionalNullable=" + optionalNullable + ", optionalNullableWithDefaultValue="
                + optionalNullableWithDefaultValue + ", optional=" + optional + ", childClassArray="
                + childClassArray + ", grandParentRequiredNullable="
                + getGrandParentRequiredNullable() + ", grandParentRequired="
                + getGrandParentRequired() + ", parentRequiredNullable="
                + getParentRequiredNullable() + ", parentRequired=" + getParentRequired()
                + ", grandParentOptional=" + getGrandParentOptional() + ", mClass="
                + getClassField() + ", precision=" + getPrecision() + ", bigDecimal="
                + getBigDecimal() + ", parentOptionalNullableWithDefaultValue="
                + getParentOptionalNullableWithDefaultValue() + ", parentOptional="
                + getParentOptional() + "]";
    }

    /**
     * Builds a new {@link ChildClass.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChildClass.Builder} object
     */
    public Builder toChildClassBuilder() {
        Builder builder = new Builder(getGrandParentRequiredNullable(), getGrandParentRequired(),
                getParentRequiredNullable(), getParentRequired(), requiredNullable, required)
                .optional(getOptional())
                .grandParentOptional(getGrandParentOptional())
                .parentOptional(getParentOptional());
        builder.optionalNullable = internalGetOptionalNullable();
        builder.optionalNullableWithDefaultValue = internalGetOptionalNullableWithDefaultValue();
        builder.childClassArray = internalGetChildClassArray();
        builder.mClass = internalGetClassField();
        builder.precision = internalGetPrecision();
        builder.bigDecimal = internalGetBigDecimal();
        builder.parentOptionalNullableWithDefaultValue =
                internalGetParentOptionalNullableWithDefaultValue();
        return builder;
    }

    /**
     * Class to build instances of {@link ChildClass}.
     */
    public static class Builder {
        private String grandParentRequiredNullable;
        private String grandParentRequired = "not nullable and required";
        private String parentRequiredNullable;
        private String parentRequired = "not nullable and required";
        private String requiredNullable;
        private String required = "not nullable and required";
        private String grandParentOptional;
        private OptionalNullable<Integer> mClass = OptionalNullable.of(23);
        private OptionalNullable<Double> precision;
        private OptionalNullable<BigDecimal> bigDecimal;
        private OptionalNullable<String> parentOptionalNullableWithDefaultValue =
                OptionalNullable.of("Has default value");
        private String parentOptional;
        private OptionalNullable<String> optionalNullable;
        private OptionalNullable<String> optionalNullableWithDefaultValue =
                OptionalNullable.of("With default value");
        private String optional;
        private OptionalNullable<List<ChildClass>> childClassArray;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  grandParentRequiredNullable  String value for grandParentRequiredNullable.
         * @param  grandParentRequired  String value for grandParentRequired.
         * @param  parentRequiredNullable  String value for parentRequiredNullable.
         * @param  parentRequired  String value for parentRequired.
         * @param  requiredNullable  String value for requiredNullable.
         * @param  required  String value for required.
         */
        public Builder(String grandParentRequiredNullable, String grandParentRequired,
                String parentRequiredNullable, String parentRequired, String requiredNullable,
                String required) {
            this.grandParentRequiredNullable = grandParentRequiredNullable;
            this.grandParentRequired = grandParentRequired;
            this.parentRequiredNullable = parentRequiredNullable;
            this.parentRequired = parentRequired;
            this.requiredNullable = requiredNullable;
            this.required = required;
        }

        /**
         * Setter for grandParentRequiredNullable.
         * @param  grandParentRequiredNullable  String value for grandParentRequiredNullable.
         * @return Builder
         */
        public Builder grandParentRequiredNullable(String grandParentRequiredNullable) {
            this.grandParentRequiredNullable = grandParentRequiredNullable;
            return this;
        }

        /**
         * Setter for grandParentRequired.
         * @param  grandParentRequired  String value for grandParentRequired.
         * @return Builder
         */
        public Builder grandParentRequired(String grandParentRequired) {
            this.grandParentRequired = grandParentRequired;
            return this;
        }

        /**
         * Setter for parentRequiredNullable.
         * @param  parentRequiredNullable  String value for parentRequiredNullable.
         * @return Builder
         */
        public Builder parentRequiredNullable(String parentRequiredNullable) {
            this.parentRequiredNullable = parentRequiredNullable;
            return this;
        }

        /**
         * Setter for parentRequired.
         * @param  parentRequired  String value for parentRequired.
         * @return Builder
         */
        public Builder parentRequired(String parentRequired) {
            this.parentRequired = parentRequired;
            return this;
        }

        /**
         * Setter for requiredNullable.
         * @param  requiredNullable  String value for requiredNullable.
         * @return Builder
         */
        public Builder requiredNullable(String requiredNullable) {
            this.requiredNullable = requiredNullable;
            return this;
        }

        /**
         * Setter for required.
         * @param  required  String value for required.
         * @return Builder
         */
        public Builder required(String required) {
            this.required = required;
            return this;
        }

        /**
         * Setter for grandParentOptional.
         * @param  grandParentOptional  String value for grandParentOptional.
         * @return Builder
         */
        public Builder grandParentOptional(String grandParentOptional) {
            this.grandParentOptional = grandParentOptional;
            return this;
        }

        /**
         * Setter for mClass.
         * @param  mClass  Integer value for mClass.
         * @return Builder
         */
        public Builder mClass(Integer mClass) {
            this.mClass = OptionalNullable.of(mClass);
            return this;
        }

        /**
         * UnSetter for mClass.
         * @return Builder
         */
        public Builder unsetMClass() {
            mClass = null;
            return this;
        }

        /**
         * Setter for precision.
         * @param  precision  Double value for precision.
         * @return Builder
         */
        public Builder precision(Double precision) {
            this.precision = OptionalNullable.of(precision);
            return this;
        }

        /**
         * UnSetter for precision.
         * @return Builder
         */
        public Builder unsetPrecision() {
            precision = null;
            return this;
        }

        /**
         * Setter for bigDecimal.
         * @param  bigDecimal  BigDecimal value for bigDecimal.
         * @return Builder
         */
        public Builder bigDecimal(BigDecimal bigDecimal) {
            this.bigDecimal = OptionalNullable.of(bigDecimal);
            return this;
        }

        /**
         * UnSetter for bigDecimal.
         * @return Builder
         */
        public Builder unsetBigDecimal() {
            bigDecimal = null;
            return this;
        }

        /**
         * Setter for parentOptionalNullableWithDefaultValue.
         * @param  parentOptionalNullableWithDefaultValue  String value for
         *         parentOptionalNullableWithDefaultValue.
         * @return Builder
         */
        public Builder parentOptionalNullableWithDefaultValue(
                String parentOptionalNullableWithDefaultValue) {
            this.parentOptionalNullableWithDefaultValue =
                    OptionalNullable.of(parentOptionalNullableWithDefaultValue);
            return this;
        }

        /**
         * UnSetter for parentOptionalNullableWithDefaultValue.
         * @return Builder
         */
        public Builder unsetParentOptionalNullableWithDefaultValue() {
            parentOptionalNullableWithDefaultValue = null;
            return this;
        }

        /**
         * Setter for parentOptional.
         * @param  parentOptional  String value for parentOptional.
         * @return Builder
         */
        public Builder parentOptional(String parentOptional) {
            this.parentOptional = parentOptional;
            return this;
        }

        /**
         * Setter for optionalNullable.
         * @param  optionalNullable  String value for optionalNullable.
         * @return Builder
         */
        public Builder optionalNullable(String optionalNullable) {
            this.optionalNullable = OptionalNullable.of(optionalNullable);
            return this;
        }

        /**
         * UnSetter for optionalNullable.
         * @return Builder
         */
        public Builder unsetOptionalNullable() {
            optionalNullable = null;
            return this;
        }

        /**
         * Setter for optionalNullableWithDefaultValue.
         * @param  optionalNullableWithDefaultValue  String value for
         *         optionalNullableWithDefaultValue.
         * @return Builder
         */
        public Builder optionalNullableWithDefaultValue(String optionalNullableWithDefaultValue) {
            this.optionalNullableWithDefaultValue =
                    OptionalNullable.of(optionalNullableWithDefaultValue);
            return this;
        }

        /**
         * UnSetter for optionalNullableWithDefaultValue.
         * @return Builder
         */
        public Builder unsetOptionalNullableWithDefaultValue() {
            optionalNullableWithDefaultValue = null;
            return this;
        }

        /**
         * Setter for optional.
         * @param  optional  String value for optional.
         * @return Builder
         */
        public Builder optional(String optional) {
            this.optional = optional;
            return this;
        }

        /**
         * Setter for childClassArray.
         * @param  childClassArray  List of ChildClass value for childClassArray.
         * @return Builder
         */
        public Builder childClassArray(List<ChildClass> childClassArray) {
            this.childClassArray = OptionalNullable.of(childClassArray);
            return this;
        }

        /**
         * UnSetter for childClassArray.
         * @return Builder
         */
        public Builder unsetChildClassArray() {
            childClassArray = null;
            return this;
        }

        /**
         * Builds a new {@link ChildClass} object using the set fields.
         * @return {@link ChildClass}
         */
        public ChildClass build() {
            return new ChildClass(grandParentRequiredNullable, grandParentRequired,
                    parentRequiredNullable, parentRequired, requiredNullable, required,
                    grandParentOptional, mClass, precision, bigDecimal,
                    parentOptionalNullableWithDefaultValue, parentOptional, optionalNullable,
                    optionalNullableWithDefaultValue, optional, childClassArray);
        }
    }
}
