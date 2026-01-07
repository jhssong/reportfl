{
  "filepath": "/tmp/Lang-63b/src/java/org/apache/commons/lang/math/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 1410,
      "comment": "\n * \u003cp\u003eProvides extra functionality for Java Number classes.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:bayard@generationjava.com\"\u003eHenri Yandell\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:rand_mcneely@yahoo.com\"\u003eRand McNeely\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Eric Pugh\n * @author Phil Steitz\n * @author Matthew Hawthorne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ZERO"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Reusable Long constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ONE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Reusable Long constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_MINUS_ONE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Reusable Long constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ZERO"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Reusable Integer constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ONE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Reusable Integer constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_MINUS_ONE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Reusable Integer constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ZERO"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Reusable Short constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ONE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Reusable Short constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MINUS_ONE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Reusable Short constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ZERO"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Reusable Byte constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ONE"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Reusable Byte constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MINUS_ONE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Reusable Byte constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ZERO"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Reusable Double constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ONE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Reusable Double constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_MINUS_ONE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Reusable Double constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ZERO"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Reusable Float constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ONE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Reusable Float constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_MINUS_ONE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Reusable Float constant for minus one. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.NumberUtils.NumberUtils()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eNumberUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eNumberUtils.stringToInt(\"6\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.stringToInt(java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   NumberUtils.stringToInt(null) \u003d 0\n     *   NumberUtils.stringToInt(\"\")   \u003d 0\n     *   NumberUtils.stringToInt(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @deprecated Use {@link #toInt(String)}\n     *  This method will be removed in Commons Lang 3.0\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toInt(java.lang.String)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null) \u003d 0\n     *   NumberUtils.toInt(\"\")   \u003d 0\n     *   NumberUtils.toInt(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.stringToInt(java.lang.String, int)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   NumberUtils.stringToInt(null, 1) \u003d 1\n     *   NumberUtils.stringToInt(\"\", 1)   \u003d 1\n     *   NumberUtils.stringToInt(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     * @deprecated Use {@link #toInt(String, int)}\n     *  This method will be removed in Commons Lang 3.0\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toInt(java.lang.String, int)",
      "begin_line": 172,
      "end_line": 181,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null, 1) \u003d 1\n     *   NumberUtils.toInt(\"\", 1)   \u003d 1\n     *   NumberUtils.toInt(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toLong(java.lang.String)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null) \u003d 0L\n     *   NumberUtils.toLong(\"\")   \u003d 0L\n     *   NumberUtils.toLong(\"1\")  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the long represented by the string, or \u003ccode\u003e0\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toLong(java.lang.String, long)",
      "begin_line": 221,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null, 1L) \u003d 1L\n     *   NumberUtils.toLong(\"\", 1L)   \u003d 1L\n     *   NumberUtils.toLong(\"1\", 0L)  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the long represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toFloat(java.lang.String)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0f\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0f\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null)   \u003d 0.0f\n     *   NumberUtils.toFloat(\"\")     \u003d 0.0f\n     *   NumberUtils.toFloat(\"1.5\")  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the float represented by the string, or \u003ccode\u003e0.0f\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toFloat(java.lang.String, float)",
      "begin_line": 273,
      "end_line": 282,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null, 1.1f)   \u003d 1.0f\n     *   NumberUtils.toFloat(\"\", 1.1f)     \u003d 1.1f\n     *   NumberUtils.toFloat(\"1.5\", 0.0f)  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the float represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 274,col 7)-(line 276,col 7)",
        "(line 277,col 7)-(line 281,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toDouble(java.lang.String)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0d\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0d\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null)   \u003d 0.0d\n     *   NumberUtils.toDouble(\"\")     \u003d 0.0d\n     *   NumberUtils.toDouble(\"1.5\")  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the double represented by the string, or \u003ccode\u003e0.0d\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toDouble(java.lang.String, double)",
      "begin_line": 325,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null, 1.1d)   \u003d 1.1d\n     *   NumberUtils.toDouble(\"\", 1.1d)     \u003d 1.1d\n     *   NumberUtils.toDouble(\"1.5\", 0.0d)  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the double represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 326,col 7)-(line 328,col 7)",
        "(line 329,col 7)-(line 333,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createNumber(java.lang.String)",
      "begin_line": 398,
      "end_line": 546,
      "comment": "\n     * \u003cp\u003eTurns a string value into a java.lang.Number.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst, the value is examined for a type qualifier on the end\n     * (\u003ccode\u003e\u0027f\u0027,\u0027F\u0027,\u0027d\u0027,\u0027D\u0027,\u0027l\u0027,\u0027L\u0027\u003c/code\u003e).  If it is found, it starts \n     * trying to create successively larger types from the type specified\n     * until one is found that can represent the value.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a type specifier is not found, it will check for a decimal point\n     * and then try successively larger types from \u003ccode\u003eInteger\u003c/code\u003e to\n     * \u003ccode\u003eBigInteger\u003c/code\u003e and from \u003ccode\u003eFloat\u003c/code\u003e to\n     * \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string starts with \u003ccode\u003e0x\u003c/code\u003e or \u003ccode\u003e-0x\u003c/code\u003e, it\n     * will be interpreted as a hexadecimal integer.  Values with leading\n     * \u003ccode\u003e0\u003c/code\u003e\u0027s will not be interpreted as octal.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does not trim the input string, i.e., strings with leading\n     * or trailing spaces will generate NumberFormatExceptions.\u003c/p\u003e\n     *\n     * @param str  String containing a number, may be null\n     * @return Number created from the string\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 53)",
        "(line 416,col 9)-(line 416,col 20)",
        "(line 417,col 9)-(line 417,col 19)",
        "(line 418,col 9)-(line 418,col 19)",
        "(line 419,col 9)-(line 419,col 38)",
        "(line 420,col 9)-(line 420,col 61)",
        "(line 422,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isAllZeros(java.lang.String)",
      "begin_line": 556,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003eUtility method for {@link #createNumber(java.lang.String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if s is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the String to check\n     * @return if it is all zeros or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createFloat(java.lang.String)",
      "begin_line": 578,
      "end_line": 583,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eFloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eFloat\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createDouble(java.lang.String)",
      "begin_line": 594,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eDouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eDouble\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createInteger(java.lang.String)",
      "begin_line": 611,
      "end_line": 617,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eInteger\u003c/code\u003e, handling\n     * hex and octal notations.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createLong(java.lang.String)",
      "begin_line": 628,
      "end_line": 633,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eLong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eLong\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 632,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createBigInteger(java.lang.String)",
      "begin_line": 644,
      "end_line": 649,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigInteger\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createBigDecimal(java.lang.String)",
      "begin_line": 660,
      "end_line": 669,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 663,col 9)",
        "(line 665,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long[])",
      "begin_line": 681,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 687,col 9)",
        "(line 690,col 9)-(line 690,col 28)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 697,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int[])",
      "begin_line": 708,
      "end_line": 725,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 714,col 9)",
        "(line 717,col 9)-(line 717,col 27)",
        "(line 718,col 9)-(line 722,col 9)",
        "(line 724,col 9)-(line 724,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short[])",
      "begin_line": 735,
      "end_line": 752,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 741,col 9)",
        "(line 744,col 9)-(line 744,col 29)",
        "(line 745,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 751,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double[])",
      "begin_line": 762,
      "end_line": 779,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 768,col 9)",
        "(line 771,col 9)-(line 771,col 30)",
        "(line 772,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 778,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float[])",
      "begin_line": 789,
      "end_line": 806,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 795,col 9)",
        "(line 798,col 9)-(line 798,col 29)",
        "(line 799,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long[])",
      "begin_line": 818,
      "end_line": 835,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 824,col 9)",
        "(line 827,col 9)-(line 827,col 28)",
        "(line 828,col 9)-(line 832,col 9)",
        "(line 834,col 9)-(line 834,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int[])",
      "begin_line": 845,
      "end_line": 862,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 851,col 9)",
        "(line 854,col 9)-(line 854,col 27)",
        "(line 855,col 9)-(line 859,col 9)",
        "(line 861,col 9)-(line 861,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short[])",
      "begin_line": 872,
      "end_line": 889,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 878,col 9)",
        "(line 881,col 9)-(line 881,col 29)",
        "(line 882,col 9)-(line 886,col 9)",
        "(line 888,col 9)-(line 888,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double[])",
      "begin_line": 899,
      "end_line": 916,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 905,col 9)",
        "(line 908,col 9)-(line 908,col 30)",
        "(line 909,col 9)-(line 913,col 9)",
        "(line 915,col 9)-(line 915,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float[])",
      "begin_line": 926,
      "end_line": 943,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 932,col 9)",
        "(line 935,col 9)-(line 935,col 29)",
        "(line 936,col 9)-(line 940,col 9)",
        "(line 942,col 9)-(line 942,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long, long, long)",
      "begin_line": 955,
      "end_line": 963,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 962,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int, int, int)",
      "begin_line": 973,
      "end_line": 981,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short, short, short)",
      "begin_line": 991,
      "end_line": 999,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(byte, byte, byte)",
      "begin_line": 1009,
      "end_line": 1017,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double, double, double)",
      "begin_line": 1030,
      "end_line": 1032,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float, float, float)",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long, long, long)",
      "begin_line": 1059,
      "end_line": 1067,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1066,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int, int, int)",
      "begin_line": 1077,
      "end_line": 1085,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short, short, short)",
      "begin_line": 1095,
      "end_line": 1103,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1101,col 9)",
        "(line 1102,col 9)-(line 1102,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(byte, byte, byte)",
      "begin_line": 1113,
      "end_line": 1121,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1119,col 9)",
        "(line 1120,col 9)-(line 1120,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double, double, double)",
      "begin_line": 1134,
      "end_line": 1136,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float, float, float)",
      "begin_line": 1149,
      "end_line": 1151,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1150,col 9)-(line 1150,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(double, double)",
      "begin_line": 1188,
      "end_line": 1215,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003edoubles\u003c/code\u003e for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater\n     * than, less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e\n     * The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     *  \u003cli\u003eNaN\n     *  \u003cli\u003ePositive infinity\n     *  \u003cli\u003eMaximum double\n     *  \u003cli\u003eNormal positive numbers\n     *  \u003cli\u003e+0.0\n     *  \u003cli\u003e-0.0\n     *  \u003cli\u003eNormal negative numbers\n     *  \u003cli\u003eMinimum double (\u003ccode\u003e-Double.MAX_VALUE\u003c/code\u003e)\n     *  \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will\n     * return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003edouble\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1189,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1194,col 9)",
        "(line 1199,col 9)-(line 1199,col 52)",
        "(line 1200,col 9)-(line 1200,col 52)",
        "(line 1201,col 9)-(line 1203,col 9)",
        "(line 1210,col 9)-(line 1214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(float, float)",
      "begin_line": 1249,
      "end_line": 1276,
      "comment": "\n     * \u003cp\u003eCompares two floats for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater than,\n     * less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     * \u003cli\u003eNaN\n     * \u003cli\u003ePositive infinity\n     * \u003cli\u003eMaximum float\n     * \u003cli\u003eNormal positive numbers\n     * \u003cli\u003e+0.0\n     * \u003cli\u003e-0.0\n     * \u003cli\u003eNormal negative numbers\n     * \u003cli\u003eMinimum float (\u003ccode\u003e-Float.MAX_VALUE\u003c/code\u003e)\n     * \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will return\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003efloat\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1250,col 9)-(line 1252,col 9)",
        "(line 1253,col 9)-(line 1255,col 9)",
        "(line 1260,col 9)-(line 1260,col 48)",
        "(line 1261,col 9)-(line 1261,col 48)",
        "(line 1262,col 9)-(line 1264,col 9)",
        "(line 1271,col 9)-(line 1275,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 1289,
      "end_line": 1299,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only unicode numeric\n     ",
      "child_ranges": [
        "(line 1290,col 9)-(line 1292,col 9)",
        "(line 1293,col 9)-(line 1297,col 9)",
        "(line 1298,col 9)-(line 1298,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 1314,
      "end_line": 1408,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1318,col 41)",
        "(line 1319,col 9)-(line 1319,col 30)",
        "(line 1320,col 9)-(line 1320,col 31)",
        "(line 1321,col 9)-(line 1321,col 36)",
        "(line 1322,col 9)-(line 1322,col 35)",
        "(line 1323,col 9)-(line 1323,col 35)",
        "(line 1325,col 9)-(line 1325,col 46)",
        "(line 1326,col 9)-(line 1342,col 9)",
        "(line 1343,col 9)-(line 1343,col 13)",
        "(line 1345,col 9)-(line 1345,col 22)",
        "(line 1348,col 9)-(line 1380,col 9)",
        "(line 1381,col 9)-(line 1404,col 9)",
        "(line 1407,col 9)-(line 1407,col 41)"
      ]
    }
  ]
}