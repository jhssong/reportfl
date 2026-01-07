{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/Validate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Validate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 785,
      "comment": "\n * \u003cp\u003eThis class assists in validating arguments. The validation methods are \n * based along the following principles: \n * \u003cul\u003e\n *   \u003cli\u003eAn invalid \u003ccode\u003enull\u003c/code\u003e argument causes a {@link NullPointerException}.\u003c/li\u003e\n *   \u003cli\u003eA non-\u003ccode\u003enull\u003c/code\u003e argument causes an {@link IllegalArgumentException}.\u003c/li\u003e\n *   \u003cli\u003eAn invalid index into an array/collection/map/string causes an {@link IndexOutOfBoundsException}.\u003c/li\u003e \n * \u003c/ul\u003e\n *  \n * \u003cp\u003eAll exceptions messages are \u003ca href\u003d\"http://java.sun.com/j2se/1.5.0/docs/api/java/util/Formatter.html#syntax\"\u003eformat strings\u003c/a\u003e\n * as defined by the Java platform. For example:\u003c/p\u003e\n * \n * \u003cpre\u003e\n * Validate.isTrue(i \u003e 0, \"The value must be greater than zero: %d\", i);\n * Validate.notNull(surname, \"The surname must not be %s\", null);\n * \u003c/pre\u003e\n * \n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:ola.berg@arkitema.se\"\u003eOla Berg\u003c/a\u003e\n * @author Gary Gregory\n * @author Norm Deane\n * @author Paul Benedict\n * @version $Id$\n * @see java.lang.String#format(String, Object...)\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_NULL_EX_MESSAGE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_TRUE_EX_MESSAGE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_BLANK_EX_MESSAGE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_STATE_EX_MESSAGE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Validate.Validate()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructor. This class should not normally be instantiated.\n     ",
      "child_ranges": [
        "(line 69,col 7)-(line 69,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, long)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(i \u003e 0.0, \"The value must be greater than zero: %d\", i);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the long value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param value the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, double)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(d \u003e 0.0, \"The value must be greater than zero: %s\", d);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the double value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param value the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, java.lang.Object...)",
      "begin_line": 143,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e\u003d min \u0026\u0026 i \u003c\u003d max, \"The value must be between %d and %d\", min, max);\n     * Validate.isTrue(myObject.isOk(), \"The object is not okay\");\u003c/pre\u003e\n     *\n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception. This method is useful when validating according \n     * to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e 0);\n     * Validate.isTrue(myObject.isOk());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated expression is \n     * false\u0026quot;.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not \u003ccode\u003enull\u003c/code\u003e; \n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object is \n     * null\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the object type\n     * @param object the object to check\n     * @return the validated object (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     * @see #notNull(Object, String, Object...)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T, java.lang.String, java.lang.Object...)",
      "begin_line": 210,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not \u003ccode\u003enull\u003c/code\u003e; \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the object type\n     * @param object the object to check\n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @return the validated object (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     * @see #notNull(Object)\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 235,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a length of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray, \"The array must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param message the exception message if invalid\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[])",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a length of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated array is \n     * empty\u0026quot;.\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 283,
      "end_line": 291,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection, \"The collection must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param message the exception message if invalid\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated collection is \n     * empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Collection, String, Object...)\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 331,
      "end_line": 339,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap, \"The map must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the map type\n     * @param map the map to check\n     * @param message the exception message if invalid\n     * @return the validated map (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the map is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 357,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated map is \n     * empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the map type\n     * @param map the map to check\n     * @return the validated map (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the map is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Map, String, Object...)\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 379,
      "end_line": 387,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e nor a length of zero (no characters); \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString, \"The string must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e nor a length of zero (no characters); \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated \n     * character sequence is empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence, String, Object...)\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T, java.lang.String, java.lang.Object...)",
      "begin_line": 429,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception with the specified \n     * message.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString, \"The string must not be blank\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated character \n     * sequence is blank\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence, String, Object...)\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 484,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray, \"The array contain null at position %d\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the iteration \n     * index of the invalid element is appended to the \u003ccode\u003evalues\u003c/code\u003e \n     * argument.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Object[])\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 32)",
        "(line 486,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[])",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray);\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the message in the\n     * exception is \u0026quot;The validated array contains null element at index: \n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T, java.lang.String, java.lang.Object...)",
      "begin_line": 544,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection, \"The collection contains null at position %d\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the iterable is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the iterable has a \u003ccode\u003enull\u003c/code\u003e element, then the iteration \n     * index of the invalid element is appended to the \u003ccode\u003evalues\u003c/code\u003e \n     * argument.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable the iterable to check\n     * @return the validated iterable (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Iterable)\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 35)",
        "(line 546,col 9)-(line 546,col 18)",
        "(line 547,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection);\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the iterable is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the message in the\n     * exception is \u0026quot;The validated iterable contains null element at index: \n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable the iterable to check\n     * @return the validated iterable (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Collection, String, Object...)\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int, java.lang.String, java.lang.Object...)",
      "begin_line": 602,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * array; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2, \"The array index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message of the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int)\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 32)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * array; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message of the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the index is invalid, then the message of the exception is \n     * \u0026quot;The validated array index is invalid: \u0026quot; followed by the \n     * index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param index the index\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int, String, Object...)\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 656,
      "end_line": 662,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * collection; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2, \"The collection index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the collection is \u003ccode\u003enull\u003c/code\u003e, then the message of the \n     * exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int)\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 37)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 682,
      "end_line": 684,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * collection; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the index is invalid, then the message of the exception \n     * is \u0026quot;The validated collection index is invalid: \u0026quot; \n     * followed by the index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param index the index\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int, String, Object...)\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 708,
      "end_line": 714,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * character sequence; otherwise throwing an exception with the \n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myStr, 2, \"The string index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the character sequence is \u003ccode\u003enull\u003c/code\u003e, then the message \n     * of the exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 32)",
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 738,
      "end_line": 740,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * character sequence; otherwise throwing an exception.\u003c/p\u003e\n     * \n     * \u003cpre\u003eValidate.validIndex(myStr, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the character sequence is \u003ccode\u003enull\u003c/code\u003e, then the message \n     * of the exception is \u0026quot;The validated object is \n     * null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the index is invalid, then the message of the exception \n     * is \u0026quot;The validated character sequence index is invalid: \u0026quot; \n     * followed by the index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param index the index\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int, String, Object...)\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validState(boolean)",
      "begin_line": 759,
      "end_line": 763,
      "comment": "\n     * \u003cp\u003eValidate that the stateful condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception. This method is useful when validating according \n     * to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.validState(field \u003e 0);\n     * Validate.validState(this.isOk());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated state is \n     * false\u0026quot;.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @throws IllegalStateException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #validState(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 762,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validState(boolean, java.lang.String, java.lang.Object...)",
      "begin_line": 779,
      "end_line": 783,
      "comment": "\n     * \u003cp\u003eValidate that the stateful condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validState(this.isOk(), \"The state is not OK: %s\", myObject);\u003c/pre\u003e\n     *\n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @throws IllegalStateException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #validState(boolean)\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 782,col 9)"
      ]
    }
  ]
}