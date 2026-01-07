{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/BooleanUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BooleanUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 944,
      "comment": "\n * \u003cp\u003eOperations on boolean primitives and Boolean objects.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle {@code null} input gracefully.\n * An exception will not be thrown for a {@code null} input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.BooleanUtils.BooleanUtils()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * \u003cp\u003e{@code BooleanUtils} instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as {@code BooleanUtils.negate(true);}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 42,col 7)-(line 42,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.negate(java.lang.Boolean)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eNegates the specified boolean.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code null} is passed in, {@code null} will be returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.negate(Boolean.TRUE)  \u003d Boolean.FALSE;\n     *   BooleanUtils.negate(Boolean.FALSE) \u003d Boolean.TRUE;\n     *   BooleanUtils.negate(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to negate, may be null\n     * @return the negated Boolean, or {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 67,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isTrue(java.lang.Boolean)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003eChecks if a {@code Boolean} value is {@code true},\n     * handling {@code null} by returning {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isTrue(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isTrue(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isTrue(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns {@code false}\n     * @return {@code true} only if the input is non-null and true\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isNotTrue(java.lang.Boolean)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * \u003cp\u003eChecks if a {@code Boolean} value is \u003ci\u003enot\u003c/i\u003e {@code true},\n     * handling {@code null} by returning {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotTrue(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isNotTrue(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isNotTrue(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns {@code true}\n     * @return {@code true} if the input is null or false\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isFalse(java.lang.Boolean)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eChecks if a {@code Boolean} value is {@code false},\n     * handling {@code null} by returning {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isFalse(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isFalse(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isFalse(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns {@code false}\n     * @return {@code true} only if the input is non-null and false\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.isNotFalse(java.lang.Boolean)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eChecks if a {@code Boolean} value is \u003ci\u003enot\u003c/i\u003e {@code false},\n     * handling {@code null} by returning {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotFalse(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isNotFalse(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isNotFalse(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns {@code true}\n     * @return {@code true} if the input is null or true\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Boolean)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling {@code null}\n     * by returning {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.toBoolean(Boolean.FALSE) \u003d false\n     *   BooleanUtils.toBoolean(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return {@code true} or {@code false}, {@code null} returns {@code false}\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanDefaultIfNull(java.lang.Boolean, boolean)",
      "begin_line": 175,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) \u003d true\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) \u003d false\n     *   BooleanUtils.toBooleanDefaultIfNull(null, true)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @param valueIfNull  the boolean value to return if {@code null}\n     * @return {@code true} or {@code false}\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(int)",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean using the convention that {@code zero}\n     * is {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d false\n     *   BooleanUtils.toBoolean(1) \u003d true\n     *   BooleanUtils.toBoolean(2) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return {@code true} if non-zero, {@code false}\n     *  if zero\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(int)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean using the convention that {@code zero}\n     * is {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(1) \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(2) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  {@code null} if {@code null}\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer)",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean using the convention that {@code zero}\n     * is {@code false}.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will be converted to {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0))    \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(new Integer(1))    \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(new Integer(null)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  {@code null} if {@code null} input\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(int, int, int)",
      "begin_line": 261,
      "end_line": 270,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0, 1, 0) \u003d false\n     *   BooleanUtils.toBoolean(1, 1, 0) \u003d true\n     *   BooleanUtils.toBoolean(2, 1, 2) \u003d false\n     *   BooleanUtils.toBoolean(2, 2, 0) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for {@code true}\n     * @param falseValue  the value to match for {@code false}\n     * @return {@code true} or {@code false}\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 289,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a boolean specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0), new Integer(1), new Integer(0)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(2)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(2), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(null, null, new Integer(0))                     \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for {@code true}, may be {@code null}\n     * @param falseValue  the value to match for {@code false}, may be {@code null}\n     * @return {@code true} or {@code false}\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 303,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(int, int, int, int)",
      "begin_line": 324,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(0, 0, 2, 3) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(2, 1, 2, 3) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(3, 1, 2, 3) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for {@code true}\n     * @param falseValue  the value to match for {@code false}\n     * @param nullValue  the value to to match for {@code null}\n     * @return Boolean.TRUE, Boolean.FALSE, or {@code null}\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 356,
      "end_line": 376,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(new Integer(0), new Integer(0), new Integer(2), new Integer(3)) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for {@code true}, may be {@code null}\n     * @param falseValue  the value to match for {@code false}, may be {@code null}\n     * @param nullValue  the value to to match for {@code null}, may be {@code null}\n     * @return Boolean.TRUE, Boolean.FALSE, or {@code null}\n     * @throws IllegalArgumentException if no match\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(boolean)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int using the convention that\n     * {@code zero} is {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true)  \u003d 1\n     *   BooleanUtils.toInteger(false) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if {@code true}, zero if {@code false}\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer using the convention that\n     * {@code zero} is {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if {@code true}, zero if {@code false}\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean)",
      "begin_line": 426,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a Integer using the convention that\n     * {@code zero} is {@code false}.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will be converted to {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @return one if Boolean.TRUE, zero if Boolean.FALSE, {@code null} if {@code null}\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(boolean, int, int)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true, 1, 0)  \u003d 1\n     *   BooleanUtils.toInteger(false, 1, 0) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if {@code true}\n     * @param falseValue  the value to return if {@code false}\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toInteger(java.lang.Boolean, int, int, int)",
      "begin_line": 465,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an int specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  \u003d 1\n     *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) \u003d 0\n     *   BooleanUtils.toInteger(null, 1, 0, 2)          \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if {@code true}\n     * @param falseValue  the value to return if {@code false}\n     * @param nullValue  the value to return if {@code null}\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(boolean, java.lang.Integer, java.lang.Integer)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true, new Integer(1), new Integer(0))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false, new Integer(1), new Integer(0)) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if {@code true}, may be {@code null}\n     * @param falseValue  the value to return if {@code false}, may be {@code null}\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toIntegerObject(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 504,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE, new Integer(1), new Integer(0), new Integer(2))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE, new Integer(1), new Integer(0), new Integer(2)) \u003d new Integer(0)\n     *   BooleanUtils.toIntegerObject(null, new Integer(1), new Integer(0), new Integer(2))          \u003d new Integer(2)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if {@code true}, may be {@code null}\n     * @param falseValue  the value to return if {@code false}, may be {@code null}\n     * @param nullValue  the value to return if {@code null}, may be {@code null}\n     * @return the appropriate value\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String)",
      "begin_line": 538,
      "end_line": 624,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code \u0027true\u0027}, {@code \u0027on\u0027} or {@code \u0027yes\u0027}\n     * (case insensitive) will return {@code true}.\n     * {@code \u0027false\u0027}, {@code \u0027off\u0027} or {@code \u0027no\u0027}\n     * (case insensitive) will return {@code false}.\n     * Otherwise, {@code null} is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(null)    \u003d null\n     *   BooleanUtils.toBooleanObject(\"true\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"on\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"ON\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"off\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"oFf\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"blue\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the Boolean value of the string, {@code null} if no match or {@code null} input\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 623,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBooleanObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 645,
      "end_line": 665,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(\"true\", \"true\", \"false\", \"null\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\", \"true\", \"false\", \"null\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"null\", \"true\", \"false\", \"null\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for {@code true} (case sensitive), may be {@code null}\n     * @param falseString  the String to match for {@code false} (case sensitive), may be {@code null}\n     * @param nullString  the String to match for {@code null} (case sensitive), may be {@code null}\n     * @return the Boolean value of the string, {@code null} if either the String matches {@code nullString}\n     *  or if {@code null} input and {@code nullString} is {@code null}\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 664,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String)",
      "begin_line": 694,
      "end_line": 696,
      "comment": "\n     * \u003cp\u003eConverts a String to a boolean (optimised for performance).\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code \u0027true\u0027}, {@code \u0027on\u0027} or {@code \u0027yes\u0027}\n     * (case insensitive) will return {@code true}. Otherwise,\n     * {@code false} is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method performs 4 times faster (JDK1.4) than\n     * {@code Boolean.valueOf(String)}. However, this method accepts\n     * \u0027on\u0027 and \u0027yes\u0027 as true values.\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(null)    \u003d false\n     *   BooleanUtils.toBoolean(\"true\")  \u003d true\n     *   BooleanUtils.toBoolean(\"TRUE\")  \u003d true\n     *   BooleanUtils.toBoolean(\"tRUe\")  \u003d true\n     *   BooleanUtils.toBoolean(\"on\")    \u003d true\n     *   BooleanUtils.toBoolean(\"yes\")   \u003d true\n     *   BooleanUtils.toBoolean(\"false\") \u003d false\n     *   BooleanUtils.toBoolean(\"x gti\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the boolean value of the string, {@code false} if no match or the String is null\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toBoolean(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 712,
      "end_line": 726,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match found.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(\"true\", \"true\", \"false\")  \u003d true\n     *   BooleanUtils.toBoolean(\"false\", \"true\", \"false\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for {@code true} (case sensitive), may be {@code null}\n     * @param falseString  the String to match for {@code false} (case sensitive), may be {@code null}\n     * @return the boolean value of the string\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 723,col 9)",
        "(line 725,col 9)-(line 725,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(java.lang.Boolean)",
      "begin_line": 743,
      "end_line": 745,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning {@code \u0027true\u0027},\n     * {@code \u0027false\u0027}, or {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(Boolean.TRUE)  \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(Boolean.FALSE) \u003d \"false\"\n     *   BooleanUtils.toStringTrueFalse(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return {@code \u0027true\u0027}, {@code \u0027false\u0027}, or {@code null}\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringOnOff(java.lang.Boolean)",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning {@code \u0027on\u0027},\n     * {@code \u0027off\u0027}, or {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(Boolean.TRUE)  \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(Boolean.FALSE) \u003d \"off\"\n     *   BooleanUtils.toStringOnOff(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return {@code \u0027on\u0027}, {@code \u0027off\u0027}, or {@code null}\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringYesNo(java.lang.Boolean)",
      "begin_line": 777,
      "end_line": 779,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning {@code \u0027yes\u0027},\n     * {@code \u0027no\u0027}, or {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(Boolean.TRUE)  \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(Boolean.FALSE) \u003d \"no\"\n     *   BooleanUtils.toStringYesNo(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return {@code \u0027yes\u0027}, {@code \u0027no\u0027}, or {@code null}\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toString(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 796,
      "end_line": 801,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning one of the input Strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toString(Boolean.TRUE, \"true\", \"false\", null)   \u003d \"true\"\n     *   BooleanUtils.toString(Boolean.FALSE, \"true\", \"false\", null)  \u003d \"false\"\n     *   BooleanUtils.toString(null, \"true\", \"false\", null)           \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if {@code true}, may be {@code null}\n     * @param falseString  the String to return if {@code false}, may be {@code null}\n     * @param nullString  the String to return if {@code null}, may be {@code null}\n     * @return one of the three input Strings\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringTrueFalse(boolean)",
      "begin_line": 817,
      "end_line": 819,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning {@code \u0027true\u0027}\n     * or {@code \u0027false\u0027}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(true)   \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(false)  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return {@code \u0027true\u0027}, {@code \u0027false\u0027}, or {@code null}\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringOnOff(boolean)",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning {@code \u0027on\u0027}\n     * or {@code \u0027off\u0027}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(true)   \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(false)  \u003d \"off\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return {@code \u0027on\u0027}, {@code \u0027off\u0027}, or {@code null}\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toStringYesNo(boolean)",
      "begin_line": 849,
      "end_line": 851,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning {@code \u0027yes\u0027}\n     * or {@code \u0027no\u0027}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(true)   \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(false)  \u003d \"no\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return {@code \u0027yes\u0027}, {@code \u0027no\u0027}, or {@code null}\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.toString(boolean, java.lang.String, java.lang.String)",
      "begin_line": 866,
      "end_line": 868,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning one of the input Strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toString(true, \"true\", \"false\")   \u003d \"true\"\n     *   BooleanUtils.toString(false, \"true\", \"false\")  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if {@code true}, may be {@code null}\n     * @param falseString  the String to return if {@code false}, may be {@code null}\n     * @return one of the two input Strings\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.xor(boolean...)",
      "begin_line": 886,
      "end_line": 911,
      "comment": "\n     * \u003cp\u003ePerforms an xor on a set of booleans.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new boolean[] { true, true })   \u003d false\n     *   BooleanUtils.xor(new boolean[] { false, false }) \u003d false\n     *   BooleanUtils.xor(new boolean[] { true, false })  \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of {@code boolean}s\n     * @return {@code true} if the xor is successful.\n     * @throws IllegalArgumentException if {@code array} is {@code null}\n     * @throws IllegalArgumentException if {@code array} is empty.\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 893,col 9)",
        "(line 896,col 9)-(line 896,col 26)",
        "(line 897,col 9)-(line 907,col 9)",
        "(line 910,col 9)-(line 910,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.BooleanUtils.xor(java.lang.Boolean...)",
      "begin_line": 928,
      "end_line": 942,
      "comment": "\n     * \u003cp\u003ePerforms an xor on an array of Booleans.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })   \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }) \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })  \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of {@code Boolean}s\n     * @return {@code true} if the xor is successful.\n     * @throws IllegalArgumentException if {@code array} is {@code null}\n     * @throws IllegalArgumentException if {@code array} is empty.\n     * @throws IllegalArgumentException if {@code array} contains a {@code null}\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 35)",
        "(line 936,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 941,col 61)"
      ]
    }
  ]
}