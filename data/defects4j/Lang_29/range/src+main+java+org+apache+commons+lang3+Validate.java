{
  "filepath": "/tmp/Lang-29b/src/main/java/org/apache/commons/lang3/Validate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Validate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 51,
      "end_line": 1014,
      "comment": "\n * \u003cp\u003eThis class assists in validating arguments. The validation methods are \n * based along the following principles: \n * \u003cul\u003e\n *   \u003cli\u003eAn invalid \u003ccode\u003enull\u003c/code\u003e argument causes a {@link NullPointerException}.\u003c/li\u003e\n *   \u003cli\u003eA non-\u003ccode\u003enull\u003c/code\u003e argument causes an {@link IllegalArgumentException}.\u003c/li\u003e\n *   \u003cli\u003eAn invalid index into an array/collection/map/string causes an {@link IndexOutOfBoundsException}.\u003c/li\u003e \n * \u003c/ul\u003e\n *  \n * \u003cp\u003eAll exceptions messages are \u003ca href\u003d\"http://java.sun.com/j2se/1.5.0/docs/api/java/util/Formatter.html#syntax\"\u003eformat strings\u003c/a\u003e\n * as defined by the Java platform. For example:\u003c/p\u003e\n * \n * \u003cpre\u003e\n * Validate.isTrue(i \u003e 0, \"The value must be greater than zero: %d\", i);\n * Validate.notNull(surname, \"The surname must not be %s\", null);\n * \u003c/pre\u003e\n * \n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:ola.berg@arkitema.se\"\u003eOla Berg\u003c/a\u003e\n * @author Gary Gregory\n * @author Norm Deane\n * @author Paul Benedict\n * @version $Id$\n * @see java.lang.String#format(String, Object...)\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MATCHES_PATTERN_EX"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_NULL_EX_MESSAGE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_TRUE_EX_MESSAGE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 59,
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
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_STATE_EX_MESSAGE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_ASSIGNABLE_EX_MESSAGE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_INSTANCE_OF_EX_MESSAGE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Validate.Validate()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Constructor. This class should not normally be instantiated.\n     ",
      "child_ranges": [
        "(line 76,col 7)-(line 76,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, long)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(i \u003e 0.0, \"The value must be greater than zero: %d\", i);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the long value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param value the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, double)",
      "begin_line": 126,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(d \u003e 0.0, \"The value must be greater than zero: %s\", d);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the double value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param value the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, java.lang.Object...)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e\u003d min \u0026\u0026 i \u003c\u003d max, \"The value must be between %d and %d\", min, max);\n     * Validate.isTrue(myObject.isOk(), \"The object is not okay\");\u003c/pre\u003e\n     *\n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean)",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception. This method is useful when validating according \n     * to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e 0);\n     * Validate.isTrue(myObject.isOk());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated expression is \n     * false\u0026quot;.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not \u003ccode\u003enull\u003c/code\u003e; \n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object is \n     * null\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the object type\n     * @param object the object to check\n     * @return the validated object (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     * @see #notNull(Object, String, Object...)\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T, java.lang.String, java.lang.Object...)",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not \u003ccode\u003enull\u003c/code\u003e; \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the object type\n     * @param object the object to check\n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @return the validated object (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     * @see #notNull(Object)\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 242,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a length of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray, \"The array must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param message the exception message if invalid\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[])",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a length of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated array is \n     * empty\u0026quot;.\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 290,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection, \"The collection must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param message the exception message if invalid\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated collection is \n     * empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Collection, String, Object...)\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 338,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap, \"The map must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the map type\n     * @param map the map to check\n     * @param message the exception message if invalid\n     * @return the validated map (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the map is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated map is \n     * empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the map type\n     * @param map the map to check\n     * @return the validated map (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the map is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Map, String, Object...)\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 386,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e nor a length of zero (no characters); \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString, \"The string must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e nor a length of zero (no characters); \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated \n     * character sequence is empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence, String, Object...)\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T, java.lang.String, java.lang.Object...)",
      "begin_line": 436,
      "end_line": 444,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception with the specified \n     * message.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString, \"The string must not be blank\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T)",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated character \n     * sequence is blank\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence, String, Object...)\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 491,
      "end_line": 500,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray, \"The array contain null at position %d\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the iteration \n     * index of the invalid element is appended to the \u003ccode\u003evalues\u003c/code\u003e \n     * argument.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Object[])\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 32)",
        "(line 493,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[])",
      "begin_line": 523,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray);\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the message in the\n     * exception is \u0026quot;The validated array contains null element at index: \n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T, java.lang.String, java.lang.Object...)",
      "begin_line": 551,
      "end_line": 561,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection, \"The collection contains null at position %d\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the iterable is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the iterable has a \u003ccode\u003enull\u003c/code\u003e element, then the iteration \n     * index of the invalid element is appended to the \u003ccode\u003evalues\u003c/code\u003e \n     * argument.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable the iterable to check\n     * @return the validated iterable (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Iterable)\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 35)",
        "(line 553,col 9)-(line 553,col 18)",
        "(line 554,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection);\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the iterable is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the message in the\n     * exception is \u0026quot;The validated iterable contains null element at index: \n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable the iterable to check\n     * @return the validated iterable (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Iterable, String, Object...)\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int, java.lang.String, java.lang.Object...)",
      "begin_line": 609,
      "end_line": 615,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * array; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2, \"The array index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message of the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int)\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 32)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 614,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int)",
      "begin_line": 638,
      "end_line": 640,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * array; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message of the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the index is invalid, then the message of the exception is \n     * \u0026quot;The validated array index is invalid: \u0026quot; followed by the \n     * index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param index the index\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int, String, Object...)\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 663,
      "end_line": 669,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * collection; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2, \"The collection index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the collection is \u003ccode\u003enull\u003c/code\u003e, then the message of the \n     * exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int)\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 37)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * collection; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the index is invalid, then the message of the exception \n     * is \u0026quot;The validated collection index is invalid: \u0026quot; \n     * followed by the index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param index the index\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int, String, Object...)\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 715,
      "end_line": 721,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * character sequence; otherwise throwing an exception with the \n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myStr, 2, \"The string index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the character sequence is \u003ccode\u003enull\u003c/code\u003e, then the message \n     * of the exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 32)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 745,
      "end_line": 747,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * character sequence; otherwise throwing an exception.\u003c/p\u003e\n     * \n     * \u003cpre\u003eValidate.validIndex(myStr, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the character sequence is \u003ccode\u003enull\u003c/code\u003e, then the message \n     * of the exception is \u0026quot;The validated object is \n     * null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the index is invalid, then the message of the exception \n     * is \u0026quot;The validated character sequence index is invalid: \u0026quot; \n     * followed by the index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param index the index\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int, String, Object...)\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validState(boolean)",
      "begin_line": 766,
      "end_line": 770,
      "comment": "\n     * \u003cp\u003eValidate that the stateful condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception. This method is useful when validating according \n     * to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.validState(field \u003e 0);\n     * Validate.validState(this.isOk());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated state is \n     * false\u0026quot;.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @throws IllegalStateException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #validState(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 769,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validState(boolean, java.lang.String, java.lang.Object...)",
      "begin_line": 786,
      "end_line": 790,
      "comment": "\n     * \u003cp\u003eValidate that the stateful condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validState(this.isOk(), \"The state is not OK: %s\", myObject);\u003c/pre\u003e\n     *\n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @throws IllegalStateException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #validState(boolean)\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 789,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.matchesPattern(java.lang.CharSequence, java.lang.String)",
      "begin_line": 805,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence matches the specified regular\n     * expression pattern; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.matchesPattern(\"hi\", \"[a-z]*\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe syntax of the pattern is the one used in the {@link Pattern} class.\u003c/p\u003e\n     * \n     * @param input the character sequence to validate\n     * @param pattern regular expression pattern\n     * @throws IllegalArgumentException if the character sequence does not match the pattern\n     * @see #matchesPattern(CharSequence, String, String, Object...)\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 810,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.matchesPattern(java.lang.CharSequence, java.lang.String, java.lang.String, java.lang.Object...)",
      "begin_line": 828,
      "end_line": 834,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence matches the specified regular\n     * expression pattern; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.matchesPattern(\"hi\", \"[a-z]*\", \"%s does not match %s\", \"hi\" \"[a-z]*\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe syntax of the pattern is the one used in the {@link Pattern} class.\u003c/p\u003e\n     * \n     * @param input the character sequence to validate\n     * @param pattern regular expression pattern\n     * @param message the exception message\n     * @param values (optional) values to replace in the exception message\n     * @throws IllegalArgumentException if the character sequence does not match the pattern\n     * @see #matchesPattern(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.inclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 848,
      "end_line": 854,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * inclusive values specified; otherwise, throws an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1);\u003c/pre\u003e\n     * \n     * @param value the object to validate\n     * @param start the inclusive start value\n     * @param end the inclusive end value\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #inclusiveBetween(Object, Object, Comparable, String, Object...)\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 853,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.inclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 871,
      "end_line": 877,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * inclusive values specified; otherwise, throws an exception with the\n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1, \"Not in boundaries\");\u003c/pre\u003e\n     * \n     * @param value the object to validate\n     * @param start the inclusive start value\n     * @param end the inclusive end value\n     * @param message the exception message\n     * @param values to replace in the exception message (optional)\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #inclusiveBetween(Object, Object, Comparable)\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 876,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.exclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 891,
      "end_line": 897,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * exclusive values specified; otherwise, throws an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1);\u003c/pre\u003e\n     * \n     * @param value the object to validate\n     * @param start the exclusive start value\n     * @param end the exclusive end value\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #exclusiveBetween(Object, Object, Comparable, String, Object...)\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 896,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.exclusiveBetween(T, T, java.lang.Comparable\u003cT\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 914,
      "end_line": 920,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument object fall between the two\n     * exclusive values specified; otherwise, throws an exception with the\n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.inclusiveBetween(0, 2, 1, \"Not in boundaries\");\u003c/pre\u003e\n     * \n     * @param value the object to validate\n     * @param start the exclusive start value\n     * @param end the exclusive end value\n     * @param message the exception message\n     * @param values to replace in the exception message (optional)\n     * @throws IllegalArgumentException if the value falls out of the boundaries\n     * @see #exclusiveBetween(Object, Object, Comparable)\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 919,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isInstanceOf(java.lang.Class\u003c?\u003e, java.lang.Object)",
      "begin_line": 937,
      "end_line": 943,
      "comment": "\n     * \u003cp\u003eValidate that the argument is an instance of the specified class; otherwise\n     * throwing an exception. This method is useful when validating according to an arbitrary\n     * class\u003c/p\u003e\n     * \n     * \u003cpre\u003eValidate.isInstanceOf(OkClass.class, object);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object is not an instance of\u0026quot;\n     * followed by the name of the class\u003c/p\u003e\n     * \n     * @param type the class the object must be validated against\n     * @param o the object to check\n     * @throws IllegalArgumentException if argument is not of specified class\n     * @see #isInstanceOf(Class, Object, String, Object...)\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 942,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isInstanceOf(java.lang.Class\u003c?\u003e, java.lang.Object, java.lang.String, java.lang.Object...)",
      "begin_line": 959,
      "end_line": 965,
      "comment": "\n     * \u003cp\u003eValidate that the argument is an instance of the specified class; otherwise\n     * throwing an exception with the specified message. This method is useful when \n     * validating according to an arbitrary class\u003c/p\u003e\n     * \n     * \u003cpre\u003eValidate.isInstanceOf(OkClass.classs, object, \"Wrong class, object is of class %s\", object.getClass().getName());\u003c/pre\u003e\n     * \n     * @param type the class the object must be validated against\n     * @param o the object to check\n     * @param message exception message\n     * @param values optional value for the exception message\n     * @throws IllegalArgumentException if argument is not of specified class\n     * @see #isInstanceOf(Class, Object)\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 964,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isAssignableFrom(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 982,
      "end_line": 988,
      "comment": "\n     * \u003cp\u003eValidate that the argument can be converted to the specified class; otherwise\n     * throwing an exception with the specified message. This method is useful when\n     * validating if there will be no casting errors.\u003c/p\u003e\n     * \n     * \u003cpre\u003eValidate.isAssignableFrom(SuperClass.class, object.getClass());\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object can not be converted to the\u0026quot;\n     * followed by the name of the class and \u0026quot;class\u0026quot;\u003c/p\u003e\n     * \n     * @param superType the class the class must be validated against\n     * @param type the class to check\n     * @throws IllegalArgumentException if argument can not be converted to the specified class\n     * @see #isAssignableFrom(Class, Class, String, Object...)\n     ",
      "child_ranges": [
        "(line 984,col 9)-(line 987,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isAssignableFrom(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e, java.lang.String, java.lang.Object...)",
      "begin_line": 1007,
      "end_line": 1013,
      "comment": "\n     * \u003cp\u003eValidate that the argument can be converted to the specified class; otherwise\n     * throwing an exception. This method is useful when validating if there will be no\n     * casting errors.\u003c/p\u003e\n     * \n     * \u003cpre\u003eValidate.isAssignableFrom(SuperClass.class, object.getClass());\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object can not be converted to the\u0026quot;\n     * followed by the name of the class and \u0026quot;class\u0026quot;\u003c/p\u003e\n     * \n     * @param superType the class the class must be validated against\n     * @param type the class to check\n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @throws IllegalArgumentException if argument can not be converted to the specified class\n     * @see #isAssignableFrom(Class, Class)\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1012,col 9)"
      ]
    }
  ]
}