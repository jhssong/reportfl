{
  "filepath": "/tmp/Lang-13b/src/main/java/org/apache/commons/lang3/Validate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Validate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 1070,
      "comment": "\n * \u003cp\u003eThis class assists in validating arguments. The validation methods are\n * based along the following principles:\n * \u003cul\u003e\n *   \u003cli\u003eAn invalid {@code null} argument causes a {@link NullPointerException}.\u003c/li\u003e\n *   \u003cli\u003eA non-{@code null} argument causes an {@link IllegalArgumentException}.\u003c/li\u003e\n *   \u003cli\u003eAn invalid index into an array/collection/map/string causes an {@link IndexOutOfBoundsException}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eAll exceptions messages are\n * \u003ca href\u003d\"http://java.sun.com/j2se/1.5.0/docs/api/java/util/Formatter.html#syntax\"\u003eformat strings\u003c/a\u003e\n * as defined by the Java platform. For example:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Validate.isTrue(i \u003e 0, \"The value must be greater than zero: %d\", i);\n * Validate.notNull(surname, \"The surname must not be %s\", null);\n * \u003c/pre\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @version $Id$\n * @see java.lang.String#format(String, Object...)\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE"
      ],
      "begin_line": 49,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MATCHES_PATTERN_EX"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_NULL_EX_MESSAGE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_TRUE_EX_MESSAGE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 56,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_BLANK_EX_MESSAGE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE"
      ],
      "begin_line": 62,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_STATE_EX_MESSAGE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_ASSIGNABLE_EX_MESSAGE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_INSTANCE_OF_EX_MESSAGE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Validate.Validate()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Constructor. This class should not normally be instantiated.\n     ",
      "child_ranges": [
        "(line 79,col 7)-(line 79,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, long)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is {@code true}; otherwise\n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a\n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(i \u003e 0.0, \"The value must be greater than zero: %d\", i);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the long value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     *\n     * @param expression  the boolean expression to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param value  the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is {@code false}\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, double)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is {@code true}; otherwise\n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a\n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(d \u003e 0.0, \"The value must be greater than zero: %s\", d);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the double value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     *\n     * @param expression  the boolean expression to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param value  the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is {@code false}\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, java.lang.Object...)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is {@code true}; otherwise\n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a\n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e\u003d min \u0026\u0026 i \u003c\u003d max, \"The value must be between %d and %d\", min, max);\n     * Validate.isTrue(myObject.isOk(), \"The object is not okay\");\u003c/pre\u003e\n     *\n     * @param expression  the boolean expression to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @throws IllegalArgumentException if expression is {@code false}\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is {@code true}; otherwise\n     * throwing an exception. This method is useful when validating according\n     * to an arbitrary boolean expression, such as validating a\n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e 0);\n     * Validate.isTrue(myObject.isOk());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated expression is\n     * false\u0026quot;.\u003c/p\u003e\n     *\n     * @param expression  the boolean expression to check\n     * @throws IllegalArgumentException if expression is {@code false}\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not {@code null};\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object is\n     * null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the object type\n     * @param object  the object to check\n     * @return the validated object (never {@code null} for method chaining)\n     * @throws NullPointerException if the object is {@code null}\n     * @see #notNull(Object, String, Object...)\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T, java.lang.String, java.lang.Object...)",
      "begin_line": 220,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not {@code null};\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the object type\n     * @param object  the object to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message\n     * @return the validated object (never {@code null} for method chaining)\n     * @throws NullPointerException if the object is {@code null}\n     * @see #notNull(Object)\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 246,
      "end_line": 254,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither {@code null}\n     * nor a length of zero (no elements); otherwise throwing an exception\n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray, \"The array must not be empty\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array  the array to check, validated not null by this method\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated array (never {@code null} method for chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[])",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither {@code null}\n     * nor a length of zero (no elements); otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray);\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated array is\n     * empty\u0026quot;.\n     *\n     * @param \u003cT\u003e the array type\n     * @param array  the array to check, validated not null by this method\n     * @return the validated array (never {@code null} method for chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 295,
      "end_line": 303,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither {@code null}\n     * nor a size of zero (no elements); otherwise throwing an exception\n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection, \"The collection must not be empty\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the collection type\n     * @param collection  the collection to check, validated not null by this method\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated collection (never {@code null} method for chaining)\n     * @throws NullPointerException if the collection is {@code null}\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither {@code null}\n     * nor a size of zero (no elements); otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection);\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated collection is\n     * empty\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the collection type\n     * @param collection  the collection to check, validated not null by this method\n     * @return the validated collection (never {@code null} method for chaining)\n     * @throws NullPointerException if the collection is {@code null}\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Collection, String, Object...)\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 344,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither {@code null}\n     * nor a size of zero (no elements); otherwise throwing an exception\n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap, \"The map must not be empty\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the map type\n     * @param map  the map to check, validated not null by this method\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated map (never {@code null} method for chaining)\n     * @throws NullPointerException if the map is {@code null}\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither {@code null}\n     * nor a size of zero (no elements); otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap);\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated map is\n     * empty\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the map type\n     * @param map  the map to check, validated not null by this method\n     * @return the validated map (never {@code null} method for chaining)\n     * @throws NullPointerException if the map is {@code null}\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Map, String, Object...)\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 393,
      "end_line": 401,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is\n     * neither {@code null} nor a length of zero (no characters);\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString, \"The string must not be empty\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars  the character sequence to check, validated not null by this method\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated character sequence (never {@code null} method for chaining)\n     * @throws NullPointerException if the character sequence is {@code null}\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is\n     * neither {@code null} nor a length of zero (no characters);\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString);\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated\n     * character sequence is empty\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars  the character sequence to check, validated not null by this method\n     * @return the validated character sequence (never {@code null} method for chaining)\n     * @throws NullPointerException if the character sequence is {@code null}\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence, String, Object...)\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T, java.lang.String, java.lang.Object...)",
      "begin_line": 446,
      "end_line": 454,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is\n     * neither {@code null}, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception with the specified\n     * message.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString, \"The string must not be blank\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars  the character sequence to check, validated not null by this method\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated character sequence (never {@code null} method for chaining)\n     * @throws NullPointerException if the character sequence is {@code null}\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is\n     * neither {@code null}, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString);\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated character\n     * sequence is blank\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars  the character sequence to check, validated not null by this method\n     * @return the validated character sequence (never {@code null} method for chaining)\n     * @throws NullPointerException if the character sequence is {@code null}\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 505,
      "end_line": 514,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither\n     * {@code null} nor contains any elements that are {@code null};\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray, \"The array contain null at position %d\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array is {@code null}, then the message in the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the array has a {@code null} element, then the iteration\n     * index of the invalid element is appended to the {@code values}\n     * argument.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array  the array to check, validated not null by this method\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated array (never {@code null} method for chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IllegalArgumentException if an element is {@code null}\n     * @see #noNullElements(Object[])\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 32)",
        "(line 507,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[])",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither\n     * {@code null} nor contains any elements that are {@code null};\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array is {@code null}, then the message in the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the array has a {@code null} element, then the message in the\n     * exception is \u0026quot;The validated array contains null element at index:\n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array  the array to check, validated not null by this method\n     * @return the validated array (never {@code null} method for chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IllegalArgumentException if an element is {@code null}\n     * @see #noNullElements(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T, java.lang.String, java.lang.Object...)",
      "begin_line": 567,
      "end_line": 577,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither\n     * {@code null} nor contains any elements that are {@code null};\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection, \"The collection contains null at position %d\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the iterable is {@code null}, then the message in the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the iterable has a {@code null} element, then the iteration\n     * index of the invalid element is appended to the {@code values}\n     * argument.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable  the iterable to check, validated not null by this method\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated iterable (never {@code null} method for chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IllegalArgumentException if an element is {@code null}\n     * @see #noNullElements(Iterable)\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 35)",
        "(line 569,col 9)-(line 569,col 18)",
        "(line 570,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T)",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither\n     * {@code null} nor contains any elements that are {@code null};\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the iterable is {@code null}, then the message in the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the array has a {@code null} element, then the message in the\n     * exception is \u0026quot;The validated iterable contains null element at index:\n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable  the iterable to check, validated not null by this method\n     * @return the validated iterable (never {@code null} method for chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IllegalArgumentException if an element is {@code null}\n     * @see #noNullElements(Iterable, String, Object...)\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int, java.lang.String, java.lang.Object...)",
      "begin_line": 628,
      "end_line": 634,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument\n     * array; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2, \"The array index is invalid: \");\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array is {@code null}, then the message of the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array  the array to check, validated not null by this method\n     * @param index  the index to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated array (never {@code null} for method chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 32)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int)",
      "begin_line": 659,
      "end_line": 661,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument\n     * array; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array is {@code null}, then the message of the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the index is invalid, then the message of the exception is\n     * \u0026quot;The validated array index is invalid: \u0026quot; followed by the\n     * index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array  the array to check, validated not null by this method\n     * @param index  the index to check\n     * @return the validated array (never {@code null} for method chaining)\n     * @throws NullPointerException if the array is {@code null}\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 687,
      "end_line": 693,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument\n     * collection; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2, \"The collection index is invalid: \");\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the collection is {@code null}, then the message of the\n     * exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the collection type\n     * @param collection  the collection to check, validated not null by this method\n     * @param index  the index to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated collection (never {@code null} for chaining)\n     * @throws NullPointerException if the collection is {@code null}\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 37)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument\n     * collection; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the index is invalid, then the message of the exception\n     * is \u0026quot;The validated collection index is invalid: \u0026quot;\n     * followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the collection type\n     * @param collection  the collection to check, validated not null by this method\n     * @param index  the index to check\n     * @return the validated collection (never {@code null} for method chaining)\n     * @throws NullPointerException if the collection is {@code null}\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 744,
      "end_line": 750,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument\n     * character sequence; otherwise throwing an exception with the\n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myStr, 2, \"The string index is invalid: \");\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the character sequence is {@code null}, then the message\n     * of the exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars  the character sequence to check, validated not null by this method\n     * @param index  the index to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @return the validated character sequence (never {@code null} for method chaining)\n     * @throws NullPointerException if the character sequence is {@code null}\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 32)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument\n     * character sequence; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myStr, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the character sequence is {@code null}, then the message\n     * of the exception is \u0026quot;The validated object is\n     * null\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the index is invalid, then the message of the exception\n     * is \u0026quot;The validated character sequence index is invalid: \u0026quot;\n     * followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars  the character sequence to check, validated not null by this method\n     * @param index  the index to check\n     * @return the validated character sequence (never {@code null} for method chaining)\n     * @throws NullPointerException if the character sequence is {@code null}\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validState(boolean)",
      "begin_line": 802,
      "end_line": 806,
      "comment": "\n     * \u003cp\u003eValidate that the stateful condition is {@code true}; otherwise\n     * throwing an exception. This method is useful when validating according\n     * to an arbitrary boolean expression, such as validating a\n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.validState(field \u003e 0);\n     * Validate.validState(this.isOk());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated state is\n     * false\u0026quot;.\u003c/p\u003e\n     *\n     * @param expression  the boolean expression to check\n     * @throws IllegalStateException if expression is {@code false}\n     * @see #validState(boolean, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 805,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validState(boolean, java.lang.String, java.lang.Object...)",
      "begin_line": 824,
      "end_line": 828,
      "comment": "\n     * \u003cp\u003eValidate that the stateful condition is {@code true}; otherwise\n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a\n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validState(this.isOk(), \"The state is not OK: %s\", myObject);\u003c/pre\u003e\n     *\n     * @param expression  the boolean expression to check\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @throws IllegalStateException if expression is {@code false}\n     * @see #validState(boolean)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.matchesPattern(java.lang.CharSequence, java.lang.String)",
      "begin_line": 848,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence matches the specified regular\n     * expression pattern; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.matchesPattern(\"hi\", \"[a-z]*\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe syntax of the pattern is the one used in the {@link Pattern} class.\u003c/p\u003e\n     *\n     * @param input  the character sequence to validate, not null\n     * @param pattern  the regular expression pattern, not null\n     * @throws IllegalArgumentException if the character sequence does not match the pattern\n     * @see #matchesPattern(CharSequence, String, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 851,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.matchesPattern(java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.Object...)",
      "begin_line": 871,
      "end_line": 875,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence matches the specified regular\n     * expression pattern; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.matchesPattern(\"hi\", \"[a-z]*\", \"%s does not match %s\", \"hi\" \"[a-z]*\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe syntax of the pattern is the one used in the {@link Pattern} class.\u003c/p\u003e\n     *\n     * @param input  the character sequence to validate, not null\n     * @param pattern  the regular expression pattern, not null\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @throws IllegalArgumentException if the character sequence does not match the pattern\n     * @see #matchesPattern(CharSequence, String)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.inclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 895,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * inclusive values specified; otherwise, throws an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1);\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the type of the argument object\n     * @param start  the inclusive start value, not null\n     * @param end  the inclusive end value, not null\n     * @param value  the object to validate, not null\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #inclusiveBetween(Object, Object, Comparable, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.inclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 919,
      "end_line": 923,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * inclusive values specified; otherwise, throws an exception with the\n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1, \"Not in boundaries\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the type of the argument object\n     * @param start  the inclusive start value, not null\n     * @param end  the inclusive end value, not null\n     * @param value  the object to validate, not null\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #inclusiveBetween(Object, Object, Comparable)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 922,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.exclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 943,
      "end_line": 947,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * exclusive values specified; otherwise, throws an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1);\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the type of the argument object\n     * @param start  the exclusive start value, not null\n     * @param end  the exclusive end value, not null\n     * @param value  the object to validate, not null\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #exclusiveBetween(Object, Object, Comparable, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 946,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.exclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 967,
      "end_line": 971,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * exclusive values specified; otherwise, throws an exception with the\n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1, \"Not in boundaries\");\u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the type of the argument object\n     * @param start  the exclusive start value, not null\n     * @param end  the exclusive end value, not null\n     * @param value  the object to validate, not null\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #exclusiveBetween(Object, Object, Comparable)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 968,col 9)-(line 970,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isInstanceOf(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 992,
      "end_line": 997,
      "comment": "\n     * Validates that the argument is an instance of the specified class, if not throws an exception.\n     *  \n     * \u003cp\u003eThis method is useful when validating according to an arbitrary class\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isInstanceOf(OkClass.class, object);\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;Expected type: {type}, actual: {obj_type}\u0026quot;\u003c/p\u003e\n     *\n     * @param type  the class the object must be validated against, not null\n     * @param obj  the object to check, null throws an exception\n     * @throws IllegalArgumentException if argument is not of specified class\n     * @see #isInstanceOf(Class, Object, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 996,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isInstanceOf(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.String, java.lang.Object...)",
      "begin_line": 1016,
      "end_line": 1020,
      "comment": "\n     * \u003cp\u003eValidate that the argument is an instance of the specified class; otherwise\n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary class\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isInstanceOf(OkClass.classs, object, \"Wrong class, object is of class %s\",\n     *   object.getClass().getName());\u003c/pre\u003e\n     *\n     * @param type  the class the object must be validated against, not null\n     * @param obj  the object to check, null throws an exception\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @throws IllegalArgumentException if argument is not of specified class\n     * @see #isInstanceOf(Class, Object)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1019,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isAssignableFrom(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 1041,
      "end_line": 1046,
      "comment": "\n     * Validates that the argument can be converted to the specified class, if not, throws an exception.\n     * \n     * \u003cp\u003eThis method is useful when validating that there will be no casting errors.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isAssignableFrom(SuperClass.class, object.getClass());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message format of the exception is \u0026quot;Cannot assign {type} to {superType}\u0026quot;\u003c/p\u003e\n     *\n     * @param superType  the class the class must be validated against, not null\n     * @param type  the class to check, not null\n     * @throws IllegalArgumentException if type argument is not assignable to the specified superType\n     * @see #isAssignableFrom(Class, Class, String, Object...)\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1045,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isAssignableFrom(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 1065,
      "end_line": 1069,
      "comment": "\n     * Validates that the argument can be converted to the specified class, if not throws an exception.\n     *  \n     * \u003cp\u003eThis method is useful when validating if there will be no casting errors.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isAssignableFrom(SuperClass.class, object.getClass());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object can not be converted to the\u0026quot;\n     * followed by the name of the class and \u0026quot;class\u0026quot;\u003c/p\u003e\n     *\n     * @param superType  the class the class must be validated against, not null\n     * @param type  the class to check, not null\n     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null\n     * @param values  the optional values for the formatted exception message, null array not recommended\n     * @throws IllegalArgumentException if argument can not be converted to the specified class\n     * @see #isAssignableFrom(Class, Class)\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1068,col 9)"
      ]
    }
  ]
}