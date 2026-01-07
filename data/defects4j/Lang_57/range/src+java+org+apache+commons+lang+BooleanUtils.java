{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/BooleanUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BooleanUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 930,
      "comment": "\n * \u003cp\u003eOperations on boolean primitives and Boolean objects.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @author Stephen Colebourne\n * @author Matthew Hawthorne\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.BooleanUtils.BooleanUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eBooleanUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eBooleanUtils.toBooleanObject(true);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.negate(java.lang.Boolean)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eNegates the specified boolean.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003enull\u003c/code\u003e is passed in, \u003ccode\u003enull\u003c/code\u003e will be returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.negate(Boolean.TRUE)  \u003d Boolean.FALSE;\n     *   BooleanUtils.negate(Boolean.FALSE) \u003d Boolean.TRUE;\n     *   BooleanUtils.negate(null)          \u003d null;\n     * \u003c/pre\u003e\n     * \n     * @param bool  the Boolean to negate, may be null\n     * @return the negated Boolean, or \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.isTrue(java.lang.Boolean)",
      "begin_line": 85,
      "end_line": 90,
      "comment": "\n     * \u003cp\u003eIs a Boolean value \u003ccode\u003etrue\u003c/code\u003e, handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isTrue(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isTrue(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isTrue(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and true\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.isFalse(java.lang.Boolean)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eIs a Boolean value \u003ccode\u003efalse\u003c/code\u003e, handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isFalse(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isFalse(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isFalse(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and false\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(boolean)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eBoolean factory that avoids creating new Boolean objecs all the time.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method was added to JDK1.4 but is available here for earlier JDKs.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(false) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(true)  \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return Boolean.TRUE or Boolean.FALSE as appropriate\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.Boolean)",
      "begin_line": 143,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e\n     * by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.toBoolean(Boolean.FALSE) \u003d false\n     *   BooleanUtils.toBoolean(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e, \n     *  \u003ccode\u003enull\u003c/code\u003e returns \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(java.lang.Boolean, boolean)",
      "begin_line": 163,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) \u003d true\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) \u003d false\n     *   BooleanUtils.toBooleanDefaultIfNull(null, true)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @param valueIfNull  the boolean value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(int)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d false\n     *   BooleanUtils.toBoolean(1) \u003d true\n     *   BooleanUtils.toBoolean(2) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e if non-zero, \u003ccode\u003efalse\u003c/code\u003e\n     *  if zero\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(int)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(1) \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(2) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.Integer)",
      "begin_line": 224,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0))    \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(new Integer(1))    \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(new Integer(null)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(int, int, int)",
      "begin_line": 247,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0, 1, 0) \u003d false\n     *   BooleanUtils.toBoolean(1, 1, 0) \u003d true\n     *   BooleanUtils.toBoolean(2, 1, 2) \u003d false\n     *   BooleanUtils.toBoolean(2, 2, 0) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 276,
      "end_line": 290,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0), new Integer(1), new Integer(0)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(2)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(2), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(null, null, new Integer(0))                     \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 289,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(int, int, int, int)",
      "begin_line": 308,
      "end_line": 318,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(0, 0, 2, 3) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(2, 1, 2, 3) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(3, 1, 2, 3) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 339,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(new Integer(0), new Integer(0), new Integer(2), new Integer(3)) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toInteger(boolean)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true)  \u003d 1\n     *   BooleanUtils.toInteger(false) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(java.lang.Boolean)",
      "begin_line": 407,
      "end_line": 412,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @return one if Boolean.TRUE, zero if Boolean.FALSE, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toInteger(boolean, int, int)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true, 1, 0)  \u003d 1\n     *   BooleanUtils.toInteger(false, 1, 0) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toInteger(java.lang.Boolean, int, int, int)",
      "begin_line": 446,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  \u003d 1\n     *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) \u003d 0\n     *   BooleanUtils.toInteger(null, 1, 0, 2)          \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean, java.lang.Integer, java.lang.Integer)",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true, new Integer(1), new Integer(0))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false, new Integer(1), new Integer(0)) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 490,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE, new Integer(1), new Integer(0), new Integer(2))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE, new Integer(1), new Integer(0), new Integer(2)) \u003d new Integer(0)\n     *   BooleanUtils.toIntegerObject(null, new Integer(1), new Integer(0), new Integer(2))          \u003d new Integer(2)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.String)",
      "begin_line": 523,
      "end_line": 539,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003efalse\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(null)    \u003d null\n     *   BooleanUtils.toBooleanObject(\"true\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"on\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"ON\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"off\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"oFf\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"blue\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if no match or \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 536,col 9)",
        "(line 538,col 9)-(line 538,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 560,
      "end_line": 578,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(\"true\", \"true\", \"false\", \"null\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\", \"true\", \"false\", \"null\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"null\", \"true\", \"false\", \"null\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to match for \u003ccode\u003enull\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if no match or \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 577,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.String)",
      "begin_line": 607,
      "end_line": 658,
      "comment": "\n     * \u003cp\u003eConverts a String to a boolean (optimised for performance).\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e. Otherwise,\n     * \u003ccode\u003efalse\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method performs 4 times faster (JDK1.4) than\n     * \u003ccode\u003eBoolean.valueOf(String)\u003c/code\u003e. However, this method accepts\n     * \u0027on\u0027 and \u0027yes\u0027 as true values.\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(null)    \u003d false\n     *   BooleanUtils.toBoolean(\"true\")  \u003d true\n     *   BooleanUtils.toBoolean(\"TRUE\")  \u003d true\n     *   BooleanUtils.toBoolean(\"tRUe\")  \u003d true\n     *   BooleanUtils.toBoolean(\"on\")    \u003d true\n     *   BooleanUtils.toBoolean(\"yes\")   \u003d true\n     *   BooleanUtils.toBoolean(\"false\") \u003d false\n     *   BooleanUtils.toBoolean(\"x gti\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the boolean value of the string, \u003ccode\u003efalse\u003c/code\u003e if no match\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 656,col 9)",
        "(line 657,col 9)-(line 657,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 689,
      "end_line": 703,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match found.\u003c/p\u003e\n     * \n     * \u003cp\u003enull is returned if there is no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(\"true\", \"true\", \"false\")  \u003d true\n     *   BooleanUtils.toBoolean(\"false\", \"true\", \"false\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the boolean value of the string\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 700,col 9)",
        "(line 702,col 9)-(line 702,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringTrueFalse(java.lang.Boolean)",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(Boolean.TRUE)  \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(Boolean.FALSE) \u003d \"false\"\n     *   BooleanUtils.toStringTrueFalse(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringOnOff(java.lang.Boolean)",
      "begin_line": 739,
      "end_line": 741,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027off\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(Boolean.TRUE)  \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(Boolean.FALSE) \u003d \"off\"\n     *   BooleanUtils.toStringOnOff(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringYesNo(java.lang.Boolean)",
      "begin_line": 757,
      "end_line": 759,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027no\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(Boolean.TRUE)  \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(Boolean.FALSE) \u003d \"no\"\n     *   BooleanUtils.toStringYesNo(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toString(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 779,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(Boolean.TRUE, \"true\", \"false\", null)   \u003d \"true\"\n     *   BooleanUtils.toString(Boolean.FALSE, \"true\", \"false\", null)  \u003d \"false\"\n     *   BooleanUtils.toString(null, \"true\", \"false\", null)           \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the three input Strings\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringTrueFalse(boolean)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027false\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(true)   \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(false)  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean)",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027off\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(true)   \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(false)  \u003d \"off\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean)",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(true)   \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(false)  \u003d \"no\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toString(boolean, java.lang.String, java.lang.String)",
      "begin_line": 854,
      "end_line": 856,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(true, \"true\", \"false\")   \u003d \"true\"\n     *   BooleanUtils.toString(false, \"true\", \"false\")  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the two input Strings\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.xor(boolean[])",
      "begin_line": 874,
      "end_line": 898,
      "comment": "\n     * \u003cp\u003ePerforms an xor on a set of booleans.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new boolean[] { true, true })   \u003d false\n     *   BooleanUtils.xor(new boolean[] { false, false }) \u003d false\n     *   BooleanUtils.xor(new boolean[] { true, false })  \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eboolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 880,col 9)",
        "(line 883,col 9)-(line 883,col 26)",
        "(line 884,col 9)-(line 894,col 9)",
        "(line 897,col 9)-(line 897,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.xor(java.lang.Boolean[])",
      "begin_line": 915,
      "end_line": 928,
      "comment": "\n     * \u003cp\u003ePerforms an xor on an array of Booleans.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })   \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }) \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })  \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eBoolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e contains a \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 35)",
        "(line 922,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 61)"
      ]
    }
  ]
}