{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/BooleanUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BooleanUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 945,
      "comment": "\n * \u003cp\u003eOperations on boolean primitives and Boolean objects.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Matthew Hawthorne\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.BooleanUtils.BooleanUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eBooleanUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eBooleanUtils.negate(true);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.negate(java.lang.Boolean)",
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
      "signature": "org.apache.commons.lang3.BooleanUtils.isTrue(java.lang.Boolean)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ccode\u003etrue\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isTrue(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isTrue(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isTrue(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and true\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isNotTrue(java.lang.Boolean)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ci\u003enot\u003c/i\u003e \u003ccode\u003etrue\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotTrue(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isNotTrue(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isNotTrue(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003etrue\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the input is null or false\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isFalse(java.lang.Boolean)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ccode\u003efalse\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isFalse(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isFalse(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isFalse(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and false\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isNotFalse(java.lang.Boolean)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ci\u003enot\u003c/i\u003e \u003ccode\u003efalse\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotFalse(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isNotFalse(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isNotFalse(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003etrue\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the input is null or true\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Boolean)",
      "begin_line": 165,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e\n     * by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.toBoolean(Boolean.FALSE) \u003d false\n     *   BooleanUtils.toBoolean(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e, \n     *  \u003ccode\u003enull\u003c/code\u003e returns \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull(java.lang.Boolean, boolean)",
      "begin_line": 185,
      "end_line": 190,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) \u003d true\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) \u003d false\n     *   BooleanUtils.toBooleanDefaultIfNull(null, true)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @param valueIfNull  the boolean value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(int)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d false\n     *   BooleanUtils.toBoolean(1) \u003d true\n     *   BooleanUtils.toBoolean(2) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e if non-zero, \u003ccode\u003efalse\u003c/code\u003e\n     *  if zero\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(1) \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(2) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer)",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0))    \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(new Integer(1))    \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(new Integer(null)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(int, int, int)",
      "begin_line": 269,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0, 1, 0) \u003d false\n     *   BooleanUtils.toBoolean(1, 1, 0) \u003d true\n     *   BooleanUtils.toBoolean(2, 1, 2) \u003d false\n     *   BooleanUtils.toBoolean(2, 2, 0) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 298,
      "end_line": 312,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0), new Integer(1), new Integer(0)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(2)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(2), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(null, null, new Integer(0))                     \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(int, int, int, int)",
      "begin_line": 330,
      "end_line": 340,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(0, 0, 2, 3) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(2, 1, 2, 3) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(3, 1, 2, 3) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 361,
      "end_line": 379,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(new Integer(0), new Integer(0), new Integer(2), new Integer(3)) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(boolean)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true)  \u003d 1\n     *   BooleanUtils.toInteger(false) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean)",
      "begin_line": 429,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @return one if Boolean.TRUE, zero if Boolean.FALSE, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(boolean, int, int)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true, 1, 0)  \u003d 1\n     *   BooleanUtils.toInteger(false, 1, 0) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(java.lang.Boolean, int, int, int)",
      "begin_line": 468,
      "end_line": 473,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  \u003d 1\n     *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) \u003d 0\n     *   BooleanUtils.toInteger(null, 1, 0, 2)          \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean, java.lang.Integer, java.lang.Integer)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true, new Integer(1), new Integer(0))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false, new Integer(1), new Integer(0)) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 512,
      "end_line": 517,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE, new Integer(1), new Integer(0), new Integer(2))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE, new Integer(1), new Integer(0), new Integer(2)) \u003d new Integer(0)\n     *   BooleanUtils.toIntegerObject(null, new Integer(1), new Integer(0), new Integer(2))          \u003d new Integer(2)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String)",
      "begin_line": 545,
      "end_line": 561,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003efalse\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(null)    \u003d null\n     *   BooleanUtils.toBooleanObject(\"true\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"on\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"ON\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"off\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"oFf\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"blue\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if no match or \u003ccode\u003enull\u003c/code\u003e input\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 558,col 9)",
        "(line 560,col 9)-(line 560,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 585,
      "end_line": 603,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(\"true\", \"true\", \"false\", \"null\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\", \"true\", \"false\", \"null\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"null\", \"true\", \"false\", \"null\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to match for \u003ccode\u003enull\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if either the String matches \u003ccode\u003enullString\u003c/code\u003e\n     *  or if \u003ccode\u003enull\u003c/code\u003e input and \u003ccode\u003enullString\u003c/code\u003e is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String)",
      "begin_line": 632,
      "end_line": 684,
      "comment": "\n     * \u003cp\u003eConverts a String to a boolean (optimised for performance).\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e. Otherwise,\n     * \u003ccode\u003efalse\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method performs 4 times faster (JDK1.4) than\n     * \u003ccode\u003eBoolean.valueOf(String)\u003c/code\u003e. However, this method accepts\n     * \u0027on\u0027 and \u0027yes\u0027 as true values.\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(null)    \u003d false\n     *   BooleanUtils.toBoolean(\"true\")  \u003d true\n     *   BooleanUtils.toBoolean(\"TRUE\")  \u003d true\n     *   BooleanUtils.toBoolean(\"tRUe\")  \u003d true\n     *   BooleanUtils.toBoolean(\"on\")    \u003d true\n     *   BooleanUtils.toBoolean(\"yes\")   \u003d true\n     *   BooleanUtils.toBoolean(\"false\") \u003d false\n     *   BooleanUtils.toBoolean(\"x gti\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the boolean value of the string, \u003ccode\u003efalse\u003c/code\u003e if no match\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 704,
      "end_line": 718,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match found.\u003c/p\u003e\n     * \n     * \u003cp\u003enull is returned if there is no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(\"true\", \"true\", \"false\")  \u003d true\n     *   BooleanUtils.toBoolean(\"false\", \"true\", \"false\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the boolean value of the string\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 717,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(java.lang.Boolean)",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(Boolean.TRUE)  \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(Boolean.FALSE) \u003d \"false\"\n     *   BooleanUtils.toStringTrueFalse(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringOnOff(java.lang.Boolean)",
      "begin_line": 754,
      "end_line": 756,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027off\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(Boolean.TRUE)  \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(Boolean.FALSE) \u003d \"off\"\n     *   BooleanUtils.toStringOnOff(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringYesNo(java.lang.Boolean)",
      "begin_line": 772,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027no\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(Boolean.TRUE)  \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(Boolean.FALSE) \u003d \"no\"\n     *   BooleanUtils.toStringYesNo(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toString(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 794,
      "end_line": 799,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(Boolean.TRUE, \"true\", \"false\", null)   \u003d \"true\"\n     *   BooleanUtils.toString(Boolean.FALSE, \"true\", \"false\", null)  \u003d \"false\"\n     *   BooleanUtils.toString(null, \"true\", \"false\", null)           \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the three input Strings\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 798,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(boolean)",
      "begin_line": 816,
      "end_line": 818,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027false\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(true)   \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(false)  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringOnOff(boolean)",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027off\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(true)   \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(false)  \u003d \"off\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringYesNo(boolean)",
      "begin_line": 850,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(true)   \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(false)  \u003d \"no\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toString(boolean, java.lang.String, java.lang.String)",
      "begin_line": 869,
      "end_line": 871,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(true, \"true\", \"false\")   \u003d \"true\"\n     *   BooleanUtils.toString(false, \"true\", \"false\")  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the two input Strings\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.xor(boolean[])",
      "begin_line": 889,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003ePerforms an xor on a set of booleans.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new boolean[] { true, true })   \u003d false\n     *   BooleanUtils.xor(new boolean[] { false, false }) \u003d false\n     *   BooleanUtils.xor(new boolean[] { true, false })  \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eboolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 895,col 9)",
        "(line 898,col 9)-(line 898,col 26)",
        "(line 899,col 9)-(line 909,col 9)",
        "(line 912,col 9)-(line 912,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.xor(java.lang.Boolean[])",
      "begin_line": 930,
      "end_line": 943,
      "comment": "\n     * \u003cp\u003ePerforms an xor on an array of Booleans.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })   \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }) \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })  \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eBoolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e contains a \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 35)",
        "(line 937,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 942,col 61)"
      ]
    }
  ]
}