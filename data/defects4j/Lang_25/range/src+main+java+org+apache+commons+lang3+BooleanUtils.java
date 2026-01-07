{
  "filepath": "/tmp/Lang-25b/src/main/java/org/apache/commons/lang3/BooleanUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BooleanUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 974,
      "comment": "\n * \u003cp\u003eOperations on boolean primitives and Boolean objects.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @author Matthew Hawthorne\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.BooleanUtils.BooleanUtils()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eBooleanUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eBooleanUtils.negate(true);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 45,col 7)-(line 45,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.negate(java.lang.Boolean)",
      "begin_line": 64,
      "end_line": 69,
      "comment": "\n     * \u003cp\u003eNegates the specified boolean.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003enull\u003c/code\u003e is passed in, \u003ccode\u003enull\u003c/code\u003e will be returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.negate(Boolean.TRUE)  \u003d Boolean.FALSE;\n     *   BooleanUtils.negate(Boolean.FALSE) \u003d Boolean.TRUE;\n     *   BooleanUtils.negate(null)          \u003d null;\n     * \u003c/pre\u003e\n     * \n     * @param bool  the Boolean to negate, may be null\n     * @return the negated Boolean, or \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isTrue(java.lang.Boolean)",
      "begin_line": 87,
      "end_line": 92,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ccode\u003etrue\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isTrue(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isTrue(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isTrue(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and true\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isNotTrue(java.lang.Boolean)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ci\u003enot\u003c/i\u003e \u003ccode\u003etrue\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotTrue(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isNotTrue(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isNotTrue(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003etrue\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the input is null or false\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isFalse(java.lang.Boolean)",
      "begin_line": 126,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ccode\u003efalse\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isFalse(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isFalse(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isFalse(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and false\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isNotFalse(java.lang.Boolean)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ci\u003enot\u003c/i\u003e \u003ccode\u003efalse\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotFalse(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isNotFalse(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isNotFalse(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003etrue\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the input is null or true\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Boolean)",
      "begin_line": 166,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e\n     * by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.toBoolean(Boolean.FALSE) \u003d false\n     *   BooleanUtils.toBoolean(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e, \n     *  \u003ccode\u003enull\u003c/code\u003e returns \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull(java.lang.Boolean, boolean)",
      "begin_line": 186,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) \u003d true\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) \u003d false\n     *   BooleanUtils.toBooleanDefaultIfNull(null, true)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @param valueIfNull  the boolean value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(int)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d false\n     *   BooleanUtils.toBoolean(1) \u003d true\n     *   BooleanUtils.toBoolean(2) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e if non-zero, \u003ccode\u003efalse\u003c/code\u003e\n     *  if zero\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(int)",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(1) \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(2) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer)",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0))    \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(new Integer(1))    \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(new Integer(null)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(int, int, int)",
      "begin_line": 270,
      "end_line": 278,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0, 1, 0) \u003d false\n     *   BooleanUtils.toBoolean(1, 1, 0) \u003d true\n     *   BooleanUtils.toBoolean(2, 1, 2) \u003d false\n     *   BooleanUtils.toBoolean(2, 2, 0) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 299,
      "end_line": 313,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0), new Integer(1), new Integer(0)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(2)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(2), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(null, null, new Integer(0))                     \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(int, int, int, int)",
      "begin_line": 331,
      "end_line": 341,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(0, 0, 2, 3) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(2, 1, 2, 3) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(3, 1, 2, 3) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 362,
      "end_line": 380,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(new Integer(0), new Integer(0), new Integer(2), new Integer(3)) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(boolean)",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true)  \u003d 1\n     *   BooleanUtils.toInteger(false) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean)",
      "begin_line": 430,
      "end_line": 435,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @return one if Boolean.TRUE, zero if Boolean.FALSE, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(boolean, int, int)",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true, 1, 0)  \u003d 1\n     *   BooleanUtils.toInteger(false, 1, 0) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(java.lang.Boolean, int, int, int)",
      "begin_line": 469,
      "end_line": 474,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  \u003d 1\n     *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) \u003d 0\n     *   BooleanUtils.toInteger(null, 1, 0, 2)          \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean, java.lang.Integer, java.lang.Integer)",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true, new Integer(1), new Integer(0))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false, new Integer(1), new Integer(0)) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE, new Integer(1), new Integer(0), new Integer(2))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE, new Integer(1), new Integer(0), new Integer(2)) \u003d new Integer(0)\n     *   BooleanUtils.toIntegerObject(null, new Integer(1), new Integer(0), new Integer(2))          \u003d new Integer(2)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String)",
      "begin_line": 546,
      "end_line": 640,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003efalse\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(null)    \u003d null\n     *   BooleanUtils.toBooleanObject(\"true\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"on\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"ON\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"off\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"oFf\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"blue\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if no match or \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 664,
      "end_line": 682,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(\"true\", \"true\", \"false\", \"null\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\", \"true\", \"false\", \"null\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"null\", \"true\", \"false\", \"null\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to match for \u003ccode\u003enull\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if either the String matches \u003ccode\u003enullString\u003c/code\u003e\n     *  or if \u003ccode\u003enull\u003c/code\u003e input and \u003ccode\u003enullString\u003c/code\u003e is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 679,col 9)",
        "(line 681,col 9)-(line 681,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * \u003cp\u003eConverts a String to a boolean (optimised for performance).\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e. Otherwise,\n     * \u003ccode\u003efalse\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method performs 4 times faster (JDK1.4) than\n     * \u003ccode\u003eBoolean.valueOf(String)\u003c/code\u003e. However, this method accepts\n     * \u0027on\u0027 and \u0027yes\u0027 as true values.\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(null)    \u003d false\n     *   BooleanUtils.toBoolean(\"true\")  \u003d true\n     *   BooleanUtils.toBoolean(\"TRUE\")  \u003d true\n     *   BooleanUtils.toBoolean(\"tRUe\")  \u003d true\n     *   BooleanUtils.toBoolean(\"on\")    \u003d true\n     *   BooleanUtils.toBoolean(\"yes\")   \u003d true\n     *   BooleanUtils.toBoolean(\"false\") \u003d false\n     *   BooleanUtils.toBoolean(\"x gti\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the boolean value of the string, \u003ccode\u003efalse\u003c/code\u003e if no match or the String is null\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 733,
      "end_line": 747,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match found.\u003c/p\u003e\n     * \n     * \u003cp\u003enull is returned if there is no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(\"true\", \"true\", \"false\")  \u003d true\n     *   BooleanUtils.toBoolean(\"false\", \"true\", \"false\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the boolean value of the string\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 744,col 9)",
        "(line 746,col 9)-(line 746,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(java.lang.Boolean)",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(Boolean.TRUE)  \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(Boolean.FALSE) \u003d \"false\"\n     *   BooleanUtils.toStringTrueFalse(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringOnOff(java.lang.Boolean)",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027off\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(Boolean.TRUE)  \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(Boolean.FALSE) \u003d \"off\"\n     *   BooleanUtils.toStringOnOff(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringYesNo(java.lang.Boolean)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027no\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(Boolean.TRUE)  \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(Boolean.FALSE) \u003d \"no\"\n     *   BooleanUtils.toStringYesNo(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toString(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 823,
      "end_line": 828,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(Boolean.TRUE, \"true\", \"false\", null)   \u003d \"true\"\n     *   BooleanUtils.toString(Boolean.FALSE, \"true\", \"false\", null)  \u003d \"false\"\n     *   BooleanUtils.toString(null, \"true\", \"false\", null)           \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the three input Strings\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(boolean)",
      "begin_line": 845,
      "end_line": 847,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027false\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(true)   \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(false)  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringOnOff(boolean)",
      "begin_line": 862,
      "end_line": 864,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027off\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(true)   \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(false)  \u003d \"off\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringYesNo(boolean)",
      "begin_line": 879,
      "end_line": 881,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(true)   \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(false)  \u003d \"no\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toString(boolean, java.lang.String, java.lang.String)",
      "begin_line": 898,
      "end_line": 900,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(true, \"true\", \"false\")   \u003d \"true\"\n     *   BooleanUtils.toString(false, \"true\", \"false\")  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the two input Strings\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.xor(boolean...)",
      "begin_line": 918,
      "end_line": 942,
      "comment": "\n     * \u003cp\u003ePerforms an xor on a set of booleans.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new boolean[] { true, true })   \u003d false\n     *   BooleanUtils.xor(new boolean[] { false, false }) \u003d false\n     *   BooleanUtils.xor(new boolean[] { true, false })  \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eboolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 924,col 9)",
        "(line 927,col 9)-(line 927,col 26)",
        "(line 928,col 9)-(line 938,col 9)",
        "(line 941,col 9)-(line 941,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.xor(java.lang.Boolean...)",
      "begin_line": 959,
      "end_line": 972,
      "comment": "\n     * \u003cp\u003ePerforms an xor on an array of Booleans.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })   \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }) \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })  \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eBoolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e contains a \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 960,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 965,col 35)",
        "(line 966,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 971,col 61)"
      ]
    }
  ]
}