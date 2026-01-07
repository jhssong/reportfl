{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/Validate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Validate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 774,
      "comment": "\n * \u003cp\u003eThis class assists in validating arguments. The validation methods are \n * based along the following principles: \n * \u003cul\u003e\n *   \u003cli\u003eAn invalid \u003ccode\u003enull\u003c/code\u003e argument causes a {@link NullPointerException}.\u003c/li\u003e\n *   \u003cli\u003eA non-\u003ccode\u003enull\u003c/code\u003e argument causes an {@link IllegalArgumentException}.\u003c/li\u003e\n *   \u003cli\u003eAn invalid index into an array/collection/map/string causes an {@link IndexOutOfBoundsException}.\u003c/li\u003e \n * \u003c/ul\u003e\n *  \n * \u003cp\u003eAll exceptions messages are \u003ca href\u003d\"http://java.sun.com/j2se/1.5.0/docs/api/java/util/Formatter.html#syntax\"\u003eformat strings\u003c/a\u003e\n * as defined by the Java platform. For example:\u003c/p\u003e\n * \n * \u003cpre\u003e\n * Validate.isTrue(i \u003e 0, \"The value must be greater than zero: %d\", i);\n * Validate.notNull(surname, \"The surname must not be %s\", null);\n * \u003c/pre\u003e\n * \n * @author Apache Software Foundation\n * @author \u003ca href\u003d\"mailto:ola.berg@arkitema.se\"\u003eOla Berg\u003c/a\u003e\n * @author Gary Gregory\n * @author Norm Deane\n * @author Paul Benedict\n * @version $Id$\n * @see java.lang.String#format(String, Object...)\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_NULL_EXCEPTION_MESSAGE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_IS_TRUE_EXCEPTION_MESSAGE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_ARRAY_EXCEPTION_MESSAGE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EXCEPTION_MESSAGE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_BLANK_EXCEPTION_MESSAGE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_ARRAY_EXCEPTION_MESSAGE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EXCEPTION_MESSAGE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_COLLECTION_EXCEPTION_MESSAGE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NOT_EMPTY_MAP_EXCEPTION_MESSAGE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_ARRAY_EXCEPTION_MESSAGE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EXCEPTION_MESSAGE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_VALID_INDEX_COLLECTION_EXCEPTION_MESSAGE"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Validate.Validate()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Constructor. This class should not normally be instantiated.\n     ",
      "child_ranges": [
        "(line 68,col 7)-(line 68,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, java.lang.Object)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(myObject.isOk(), \"The object is not OK: %s\", myObject);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the object is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param value the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, long)",
      "begin_line": 120,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(i \u003e 0.0, \"The value must be greater than zero: %d\", i);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the long value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param value the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, double)",
      "begin_line": 146,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.isTrue(d \u003e 0.0, \"The value must be greater than zero: %s\", d);\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the double value is passed as a separate parameter and\n     * appended to the exception message only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param value the value to append to the message when invalid\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, Object)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean, java.lang.String, java.lang.Object...)",
      "begin_line": 174,
      "end_line": 178,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception with the specified message. This method is useful when\n     * validating according to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e\u003d min \u0026\u0026 i \u003c\u003d max, \"The value must be between %d and %d\", min, max);\n     * Validate.isTrue(myObject.isOk(), \"The object is not okay\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the message string should not involve a string append,\n     * instead use the {@link #isTrue(boolean, String, Object)} method.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean)\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object)\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.isTrue(boolean)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eValidate that the argument condition is \u003ccode\u003etrue\u003c/code\u003e; otherwise \n     * throwing an exception. This method is useful when validating according \n     * to an arbitrary boolean expression, such as validating a \n     * primitive number or using your own custom validation expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue(i \u003e 0);\n     * Validate.isTrue(myObject.isOk());\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated expression is \n     * false\u0026quot;.\u003c/p\u003e\n     * \n     * @param expression the boolean expression to check \n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @see #isTrue(boolean, String, long)\n     * @see #isTrue(boolean, String, double)\n     * @see #isTrue(boolean, String, Object)\n     * @see #isTrue(boolean, String, Object...)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not \u003ccode\u003enull\u003c/code\u003e; \n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message of the exception is \u0026quot;The validated object is \n     * null\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the object type\n     * @param object the object to check\n     * @return the validated object (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     * @see #notNull(Object, String, Object...)\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notNull(T, java.lang.String, java.lang.Object...)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument is not \u003ccode\u003enull\u003c/code\u003e; \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notNull(myObject, \"The object must not be null\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the object type\n     * @param object the object to check\n     * @param message the exception message if invalid\n     * @param values the optional values for the formatted exception message\n     * @return the validated object (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     * @see #notNull(Object)\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 267,
      "end_line": 275,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a length of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray, \"The array must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param message the exception message if invalid\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T[])",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a length of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myArray);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated array is \n     * empty\u0026quot;.\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the array is empty\n     * @see #notEmpty(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 315,
      "end_line": 323,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection, \"The collection must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param message the exception message if invalid\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument collection is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myCollection);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated collection is \n     * empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the collection is empty\n     * @see #notEmpty(Collection, String, Object...)\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 363,
      "end_line": 371,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception \n     * with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap, \"The map must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the map type\n     * @param map the map to check\n     * @param message the exception message if invalid\n     * @return the validated map (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the map is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Object[])\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument map is neither \u003ccode\u003enull\u003c/code\u003e \n     * nor a size of zero (no elements); otherwise throwing an exception. \n     *\n     * \u003cpre\u003eValidate.notEmpty(myMap);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated map is \n     * empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the map type\n     * @param map the map to check\n     * @return the validated map (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the map is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the map is empty\n     * @see #notEmpty(Map, String, Object...)\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T, java.lang.String, java.lang.Object...)",
      "begin_line": 411,
      "end_line": 419,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e nor a length of zero (no characters); \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString, \"The string must not be empty\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notEmpty(T)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e nor a length of zero (no characters); \n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.notEmpty(myString);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated \n     * character sequence is empty\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is empty\n     * @see #notEmpty(CharSequence, String, Object...)\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T, java.lang.String, java.lang.Object...)",
      "begin_line": 461,
      "end_line": 469,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception with the specified \n     * message.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString, \"The string must not be blank\");\u003c/pre\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.notBlank(T)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument character sequence is \n     * neither \u003ccode\u003enull\u003c/code\u003e, a length of zero (no characters), empty\n     * nor whitespace; otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.notBlank(myString);\u003c/pre\u003e\n     * \n     * \u003cp\u003eThe message in the exception is \u0026quot;The validated character \n     * sequence is blank\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the character sequence is blank\n     * @see #notBlank(CharSequence, String, Object...)\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[], java.lang.String, java.lang.Object...)",
      "begin_line": 516,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray, \"The array contain null at position %d\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the iteration \n     * index of the invalid element is appended to the \u003ccode\u003evalues\u003c/code\u003e \n     * argument.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Object[])\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 32)",
        "(line 518,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T[])",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument array is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myArray);\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the message in the\n     * exception is \u0026quot;The validated array contains null element at index: \n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Object[], String, Object...)\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T, java.lang.String, java.lang.Object...)",
      "begin_line": 576,
      "end_line": 586,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception with the specified message.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection, \"The collection contains null at position %d\");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the iterable is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the iterable has a \u003ccode\u003enull\u003c/code\u003e element, then the iteration \n     * index of the invalid element is appended to the \u003ccode\u003evalues\u003c/code\u003e \n     * argument.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable the iterable to check\n     * @return the validated iterable (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Iterable)\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 35)",
        "(line 578,col 9)-(line 578,col 18)",
        "(line 579,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.noNullElements(T)",
      "begin_line": 609,
      "end_line": 611,
      "comment": "\n     * \u003cp\u003eValidate that the specified argument iterable is neither \n     * \u003ccode\u003enull\u003c/code\u003e nor contains any elements that are \u003ccode\u003enull\u003c/code\u003e;\n     * otherwise throwing an exception.\n     *\n     * \u003cpre\u003eValidate.noNullElements(myCollection);\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the iterable is \u003ccode\u003enull\u003c/code\u003e, then the message in the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the array has a \u003ccode\u003enull\u003c/code\u003e element, then the message in the\n     * exception is \u0026quot;The validated iterable contains null element at index: \n     * \u0026quot followed by the index.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the iterable type\n     * @param iterable the iterable to check\n     * @return the validated iterable (never \u003ccode\u003enull\u003c/code\u003e method for chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if an element is \u003ccode\u003enull\u003c/code\u003e\n     * @see #noNullElements(Collection, String, Object...)\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int, java.lang.String, java.lang.Object...)",
      "begin_line": 634,
      "end_line": 640,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * array; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2, \"The array index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message of the exception \n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int)\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 32)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T[], int)",
      "begin_line": 663,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * array; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myArray, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array is \u003ccode\u003enull\u003c/code\u003e, then the message of the exception\n     * is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the index is invalid, then the message of the exception is \n     * \u0026quot;The validated array index is invalid: \u0026quot; followed by the \n     * index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the array type\n     * @param array the array to check\n     * @param index the index\n     * @return the validated array (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the array is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Object[], int, String, Object...)\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 688,
      "end_line": 694,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * collection; otherwise throwing an exception with the specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2, \"The collection index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the collection is \u003ccode\u003enull\u003c/code\u003e, then the message of the \n     * exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e for chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int)\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 37)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 693,col 9)-(line 693,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 714,
      "end_line": 716,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * collection; otherwise throwing an exception.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myCollection, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the index is invalid, then the message of the exception \n     * is \u0026quot;The validated collection index is invalid: \u0026quot; \n     * followed by the index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the collection type\n     * @param collection the collection to check\n     * @param index the index\n     * @return the validated collection (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the collection is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(Collection, int, String, Object...)\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int, java.lang.String, java.lang.Object...)",
      "begin_line": 740,
      "end_line": 746,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * character sequence; otherwise throwing an exception with the \n     * specified message.\u003c/p\u003e\n     *\n     * \u003cpre\u003eValidate.validIndex(myStr, 2, \"The string index is invalid: \");\u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the character sequence is \u003ccode\u003enull\u003c/code\u003e, then the message \n     * of the exception is \u0026quot;The validated object is null\u0026quot;.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param index the index\n     * @param message the exception message if invalid\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 32)",
        "(line 742,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Validate.validIndex(T, int)",
      "begin_line": 770,
      "end_line": 772,
      "comment": "\n     * \u003cp\u003eValidates that the index is within the bounds of the argument \n     * character sequence; otherwise throwing an exception.\u003c/p\u003e\n     * \n     * \u003cpre\u003eValidate.validIndex(myStr, 2);\u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the character sequence is \u003ccode\u003enull\u003c/code\u003e, then the message \n     * of the exception is \u0026quot;The validated object is \n     * null\u0026quot;.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the index is invalid, then the message of the exception \n     * is \u0026quot;The validated character sequence index is invalid: \u0026quot; \n     * followed by the index.\u003c/p\u003e\n     * \n     * @param \u003cT\u003e the character sequence type\n     * @param chars the character sequence to check\n     * @param index the index\n     * @return the validated character sequence (never \u003ccode\u003enull\u003c/code\u003e for method chaining)\n     * @throws NullPointerException if the character sequence is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @see #validIndex(CharSequence, int, String, Object...)\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 100)"
      ]
    }
  ]
}