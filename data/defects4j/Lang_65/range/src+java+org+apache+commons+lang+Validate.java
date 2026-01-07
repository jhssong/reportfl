{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/Validate.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Validate",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 553,
      "comment": "\n * \u003cp\u003eAssists in validating arguments.\u003c/p\u003e\n * \n * \u003cp\u003eThe class is based along the lines of JUnit. If an argument value is \n * deemed invalid, an IllegalArgumentException is thrown. For example:\u003c/p\u003e\n * \n * \u003cpre\u003e\n * Validate.isTrue( i \u003e 0, \"The value must be greater than zero: \", i);\n * Validate.notNull( surname, \"The surname must not be null\");\n * \u003c/pre\u003e\n *\n * @author \u003ca href\u003d\"mailto:ola.berg@arkitema.se\"\u003eOla Berg\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Gary Gregory\n * @author Norm Deane\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.Validate.Validate()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Constructor. This class should not normally be instantiated.\n     ",
      "child_ranges": [
        "(line 47,col 7)-(line 47,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.isTrue(boolean, java.lang.String, java.lang.Object)",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the test result is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is used when validating according to an arbitrary boolean expression,\n     * such as validating a primitive number or using your own custom validation \n     * expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue( myObject.isOk(), \"The object is not OK: \", myObject);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the object is passed as a separate parameter and\n     * appended to the message string only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression  a boolean expression\n     * @param message  the exception message you would like to see if the\n     *  expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @param value  the value to append to the message in case of error\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.isTrue(boolean, java.lang.String, long)",
      "begin_line": 100,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the test result is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is used when validating according to an arbitrary boolean expression,\n     * such as validating a primitive number or using your own custom validation \n     * expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue( i \u003e 0, \"The value must be greater than zero: \", i);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the long value is passed as a separate parameter and\n     * appended to the message string only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression  a boolean expression\n     * @param message  the exception message you would like to see if the expression is \u003ccode\u003efalse\u003c/code\u003e\n     * @param value  the value to append to the message in case of error\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.isTrue(boolean, java.lang.String, double)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the test result is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is used when validating according to an arbitrary boolean expression,\n     * such as validating a primitive number or using your own custom validation \n     * expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue( d \u003e 0.0, \"The value must be greater than zero: \", d);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the double value is passed as a separate parameter and\n     * appended to the message string only in the case of an error.\u003c/p\u003e\n     * \n     * @param expression  a boolean expression\n     * @param message  the exception message you would like to see if the expression\n     *  is \u003ccode\u003efalse\u003c/code\u003e\n     * @param value  the value to append to the message in case of error\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.isTrue(boolean, java.lang.String)",
      "begin_line": 154,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the test result is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is used when validating according to an arbitrary boolean expression,\n     * such as validating a primitive number or using your own custom validation \n     * expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue( (i \u003e 0), \"The value must be greater than zero\");\n     * Validate.isTrue( myObject.isOk(), \"The object is not OK\");\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eFor performance reasons, the message string should not involve a string append,\n     * instead use the {@link #isTrue(boolean, String, Object)} method.\u003c/p\u003e\n     * \n     * @param expression  a boolean expression\n     * @param message  the exception message you would like to see if the expression\n     *  is \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.isTrue(boolean)",
      "begin_line": 178,
      "end_line": 182,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the test result is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is used when validating according to an arbitrary boolean expression,\n     * such as validating a primitive number or using your own custom validation \n     * expression.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.isTrue( i \u003e 0 );\n     * Validate.isTrue( myObject.isOk() );\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0027The validated expression is false\u0027.\u003c/p\u003e\n     * \n     * @param expression  a boolean expression\n     * @throws IllegalArgumentException if expression is \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notNull(java.lang.Object, java.lang.String)",
      "begin_line": 200,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notNull(myObject, \"The object must not be null\");\n     * \u003c/pre\u003e\n     * \n     * @param object  the object to check is not \u003ccode\u003enull\u003c/code\u003e\n     * @param message  the exception message you would like to see\n     *  if the object is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notNull(java.lang.Object)",
      "begin_line": 219,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notNull(myObject);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0027The validated object is null\u0027.\u003c/p\u003e\n     * \n     * @param object  the object to check is not \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.lang.Object[], java.lang.String)",
      "begin_line": 240,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument array is empty (\u003ccode\u003enull\u003c/code\u003e or no elements).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myArray, \"The array must not be empty\");\n     * \u003c/pre\u003e\n     * \n     * @param array  the array to check is not empty\n     * @param message  the exception message you would like to see if the array is empty\n     * @throws IllegalArgumentException if the array is empty\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.lang.Object[])",
      "begin_line": 259,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument array is empty (\u003ccode\u003enull\u003c/code\u003e or no elements).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myArray);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0027The validated array is empty\u0027.\n     * \n     * @param array  the array to check is not empty\n     * @throws IllegalArgumentException if the array is empty\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.util.Collection, java.lang.String)",
      "begin_line": 280,
      "end_line": 284,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument Collection is empty (\u003ccode\u003enull\u003c/code\u003e or no elements).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myCollection, \"The collection must not be empty\");\n     * \u003c/pre\u003e\n     * \n     * @param collection  the collection to check is not empty\n     * @param message  the exception message you would like to see if the collection is empty\n     * @throws IllegalArgumentException if the collection is empty\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.util.Collection)",
      "begin_line": 299,
      "end_line": 303,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument Collection is empty (\u003ccode\u003enull\u003c/code\u003e or no elements).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myCollection);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0027The validated collection is empty\u0027.\u003c/p\u003e\n     * \n     * @param collection  the collection to check is not empty\n     * @throws IllegalArgumentException if the collection is empty\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.util.Map, java.lang.String)",
      "begin_line": 320,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument Map is empty (\u003ccode\u003enull\u003c/code\u003e or no elements).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myMap, \"The map must not be empty\");\n     * \u003c/pre\u003e\n     * \n     * @param map  the map to check is not empty\n     * @param message  the exception message you would like to see if the map is empty\n     * @throws IllegalArgumentException if the map is empty\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.util.Map)",
      "begin_line": 339,
      "end_line": 343,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument Map is empty (\u003ccode\u003enull\u003c/code\u003e or no elements).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myMap);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0027The validated map is empty\u0027.\u003c/p\u003e\n     * \n     * @param map  the map to check is not empty\n     * @throws IllegalArgumentException if the map is empty\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.lang.String, java.lang.String)",
      "begin_line": 360,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument String is empty (\u003ccode\u003enull\u003c/code\u003e or zero length).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myString, \"The string must not be empty\");\n     * \u003c/pre\u003e\n     * \n     * @param string  the string to check is not empty\n     * @param message  the exception message you would like to see if the string is empty\n     * @throws IllegalArgumentException if the string is empty\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.notEmpty(java.lang.String)",
      "begin_line": 379,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument String is empty (\u003ccode\u003enull\u003c/code\u003e or zero length).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.notEmpty(myString);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0027The validated string is empty\u0027.\u003c/p\u003e\n     * \n     * @param string  the string to check is not empty\n     * @throws IllegalArgumentException if the string is empty\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.noNullElements(java.lang.Object[], java.lang.String)",
      "begin_line": 405,
      "end_line": 412,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument array has \u003ccode\u003enull\u003c/code\u003e elements or is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.noNullElements(myArray, \"The array must not contain null elements\");\n     * \u003c/pre\u003e\n     * \n     * \u003cp\u003eIf the array is null then the message in the exception is \u0027The validated object is null\u0027.\u003c/p\u003e\n     *\n     * @param array  the array to check\n     * @param message  the exception message if the array has\n     *  \u003ccode\u003enull\u003c/code\u003e elements\n     * @throws IllegalArgumentException if the array has \u003ccode\u003enull\u003c/code\u003e\n     *  elements or is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 32)",
        "(line 407,col 9)-(line 411,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.noNullElements(java.lang.Object[])",
      "begin_line": 432,
      "end_line": 439,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument array has \u003ccode\u003enull\u003c/code\u003e elements or is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.noNullElements(myArray);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the array has a null element the message in the exception is\n     * \u0027The validated array contains null element at index: \u0027.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the array is null then the message in the exception is \u0027The validated object is null\u0027.\u003c/p\u003e\n     * \n     * @param array  the array to check\n     * @throws IllegalArgumentException if the array has \u003ccode\u003enull\u003c/code\u003e\n     *  elements or is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 32)",
        "(line 434,col 9)-(line 438,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.noNullElements(java.util.Collection, java.lang.String)",
      "begin_line": 461,
      "end_line": 468,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument Collection has \u003ccode\u003enull\u003c/code\u003e elements or is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.noNullElements(myCollection, \"The collection must not contain null elements\");\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eIf the collection is null then the message in the exception is \u0027The validated object is null\u0027.\u003c/p\u003e\n     * \n     * @param collection  the collection to check\n     * @param message  the exception message if the collection has\n     *  \u003ccode\u003enull\u003c/code\u003e elements\n     * @throws IllegalArgumentException if the collection has\n     *  \u003ccode\u003enull\u003c/code\u003e elements or is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 37)",
        "(line 463,col 9)-(line 467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.noNullElements(java.util.Collection)",
      "begin_line": 487,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument Collection has \u003ccode\u003enull\u003c/code\u003e elements or is\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.noNullElements(myCollection);\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe message in the exception is \u0027The validated collection contains null element at index: \u0027.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the collection is null then the message in the exception is \u0027The validated object is null\u0027.\u003c/p\u003e\n     * \n     * @param collection  the collection to check\n     * @throws IllegalArgumentException if the collection has\n     *  \u003ccode\u003enull\u003c/code\u003e elements or is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 37)",
        "(line 489,col 9)-(line 489,col 18)",
        "(line 490,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.allElementsOfType(java.util.Collection, java.lang.Class, java.lang.String)",
      "begin_line": 511,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003eValidate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e\n     * if the argument collection  is \u003ccode\u003enull\u003c/code\u003e or has elements that\n     * are not of type \u003ccode\u003eclazz\u003c/code\u003e or a subclass.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * Validate.allElementsOfType(collection, String.class, \"Collection has invalid elements\");\n     * \u003c/pre\u003e\n     *\n     * @param collection  the collection to check, not null\n     * @param clazz  the \u003ccode\u003eClass\u003c/code\u003e which the collection\u0027s elements are expected to be, not null\n     * @param message  the exception message if the \u003ccode\u003eCollection\u003c/code\u003e has elements not of type \u003ccode\u003eclazz\u003c/code\u003e\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 37)",
        "(line 513,col 9)-(line 513,col 32)",
        "(line 514,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.Validate.allElementsOfType(java.util.Collection, java.lang.Class)",
      "begin_line": 541,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003e\n     * Validate an argument, throwing \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if the argument collection is\n     * \u003ccode\u003enull\u003c/code\u003e or has elements that are not of type \u003ccode\u003eclazz\u003c/code\u003e or a subclass.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * Validate.allElementsOfType(collection, String.class);\n     * \u003c/pre\u003e\n     * \n     * \u003cp\u003e\n     * The message in the exception is \u0027The validated collection contains an element not of type clazz at index: \u0027.\n     * \u003c/p\u003e\n     * \n     * @param collection\n     *            the collection to check, not null\n     * @param clazz\n     *            the \u003ccode\u003eClass\u003c/code\u003e which the collection\u0027s elements are expected to be, not null\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 37)",
        "(line 543,col 9)-(line 543,col 32)",
        "(line 544,col 9)-(line 544,col 18)",
        "(line 545,col 9)-(line 550,col 9)"
      ]
    }
  ]
}