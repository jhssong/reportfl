{
  "filepath": "/tmp/Lang-61b/src/java/org/apache/commons/lang/math/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 1628,
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
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(byte[], byte[])",
      "begin_line": 680,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eWhether the contents of two byte[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 689,col 9)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 697,col 9)-(line 697,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(short[], short[])",
      "begin_line": 707,
      "end_line": 725,
      "comment": "\n     * \u003cp\u003eWhether the contents of two short[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 713,col 9)",
        "(line 714,col 9)-(line 716,col 9)",
        "(line 718,col 9)-(line 722,col 9)",
        "(line 724,col 9)-(line 724,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(int[], int[])",
      "begin_line": 734,
      "end_line": 752,
      "comment": "\n     * \u003cp\u003eWhether the contents of two int[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 751,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(long[], long[])",
      "begin_line": 761,
      "end_line": 779,
      "comment": "\n     * \u003cp\u003eWhether the contents of two long[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 778,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(float[], float[])",
      "begin_line": 788,
      "end_line": 806,
      "comment": "\n     * \u003cp\u003eWhether the contents of two float[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 791,col 9)",
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 797,col 9)",
        "(line 799,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(double[], double[])",
      "begin_line": 815,
      "end_line": 833,
      "comment": "\n     * \u003cp\u003eWhether the contents of two double[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 830,col 9)",
        "(line 832,col 9)-(line 832,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long[])",
      "begin_line": 845,
      "end_line": 862,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 847,col 9)-(line 851,col 9)",
        "(line 854,col 9)-(line 854,col 28)",
        "(line 855,col 9)-(line 859,col 9)",
        "(line 861,col 9)-(line 861,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int[])",
      "begin_line": 872,
      "end_line": 889,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 878,col 9)",
        "(line 881,col 9)-(line 881,col 27)",
        "(line 882,col 9)-(line 886,col 9)",
        "(line 888,col 9)-(line 888,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short[])",
      "begin_line": 899,
      "end_line": 916,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 905,col 9)",
        "(line 908,col 9)-(line 908,col 29)",
        "(line 909,col 9)-(line 913,col 9)",
        "(line 915,col 9)-(line 915,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(byte[])",
      "begin_line": 926,
      "end_line": 943,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 932,col 9)",
        "(line 935,col 9)-(line 935,col 28)",
        "(line 936,col 9)-(line 940,col 9)",
        "(line 942,col 9)-(line 942,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double[])",
      "begin_line": 953,
      "end_line": 970,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 959,col 9)",
        "(line 962,col 9)-(line 962,col 30)",
        "(line 963,col 9)-(line 967,col 9)",
        "(line 969,col 9)-(line 969,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float[])",
      "begin_line": 980,
      "end_line": 997,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 982,col 9)-(line 986,col 9)",
        "(line 989,col 9)-(line 989,col 29)",
        "(line 990,col 9)-(line 994,col 9)",
        "(line 996,col 9)-(line 996,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long[])",
      "begin_line": 1009,
      "end_line": 1026,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1015,col 9)",
        "(line 1018,col 9)-(line 1018,col 28)",
        "(line 1019,col 9)-(line 1023,col 9)",
        "(line 1025,col 9)-(line 1025,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int[])",
      "begin_line": 1036,
      "end_line": 1053,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1038,col 9)-(line 1042,col 9)",
        "(line 1045,col 9)-(line 1045,col 27)",
        "(line 1046,col 9)-(line 1050,col 9)",
        "(line 1052,col 9)-(line 1052,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short[])",
      "begin_line": 1063,
      "end_line": 1080,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1069,col 9)",
        "(line 1072,col 9)-(line 1072,col 29)",
        "(line 1073,col 9)-(line 1077,col 9)",
        "(line 1079,col 9)-(line 1079,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(byte[])",
      "begin_line": 1090,
      "end_line": 1107,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1096,col 9)",
        "(line 1099,col 9)-(line 1099,col 28)",
        "(line 1100,col 9)-(line 1104,col 9)",
        "(line 1106,col 9)-(line 1106,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double[])",
      "begin_line": 1117,
      "end_line": 1134,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1123,col 9)",
        "(line 1126,col 9)-(line 1126,col 30)",
        "(line 1127,col 9)-(line 1131,col 9)",
        "(line 1133,col 9)-(line 1133,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float[])",
      "begin_line": 1144,
      "end_line": 1161,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1150,col 9)",
        "(line 1153,col 9)-(line 1153,col 29)",
        "(line 1154,col 9)-(line 1158,col 9)",
        "(line 1160,col 9)-(line 1160,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long, long, long)",
      "begin_line": 1173,
      "end_line": 1181,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1179,col 9)",
        "(line 1180,col 9)-(line 1180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int, int, int)",
      "begin_line": 1191,
      "end_line": 1199,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1192,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1197,col 9)",
        "(line 1198,col 9)-(line 1198,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short, short, short)",
      "begin_line": 1209,
      "end_line": 1217,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1210,col 9)-(line 1212,col 9)",
        "(line 1213,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(byte, byte, byte)",
      "begin_line": 1227,
      "end_line": 1235,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1230,col 9)",
        "(line 1231,col 9)-(line 1233,col 9)",
        "(line 1234,col 9)-(line 1234,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double, double, double)",
      "begin_line": 1248,
      "end_line": 1250,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float, float, float)",
      "begin_line": 1263,
      "end_line": 1265,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long, long, long)",
      "begin_line": 1277,
      "end_line": 1285,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1278,col 9)-(line 1280,col 9)",
        "(line 1281,col 9)-(line 1283,col 9)",
        "(line 1284,col 9)-(line 1284,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int, int, int)",
      "begin_line": 1295,
      "end_line": 1303,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1298,col 9)",
        "(line 1299,col 9)-(line 1301,col 9)",
        "(line 1302,col 9)-(line 1302,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short, short, short)",
      "begin_line": 1313,
      "end_line": 1321,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1314,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1319,col 9)",
        "(line 1320,col 9)-(line 1320,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(byte, byte, byte)",
      "begin_line": 1331,
      "end_line": 1339,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1332,col 9)-(line 1334,col 9)",
        "(line 1335,col 9)-(line 1337,col 9)",
        "(line 1338,col 9)-(line 1338,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double, double, double)",
      "begin_line": 1352,
      "end_line": 1354,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1353,col 9)-(line 1353,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float, float, float)",
      "begin_line": 1367,
      "end_line": 1369,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1368,col 9)-(line 1368,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(double, double)",
      "begin_line": 1406,
      "end_line": 1433,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003edoubles\u003c/code\u003e for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater\n     * than, less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e\n     * The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     *  \u003cli\u003eNaN\n     *  \u003cli\u003ePositive infinity\n     *  \u003cli\u003eMaximum double\n     *  \u003cli\u003eNormal positive numbers\n     *  \u003cli\u003e+0.0\n     *  \u003cli\u003e-0.0\n     *  \u003cli\u003eNormal negative numbers\n     *  \u003cli\u003eMinimum double (\u003ccode\u003e-Double.MAX_VALUE\u003c/code\u003e)\n     *  \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will\n     * return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003edouble\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1407,col 9)-(line 1409,col 9)",
        "(line 1410,col 9)-(line 1412,col 9)",
        "(line 1417,col 9)-(line 1417,col 52)",
        "(line 1418,col 9)-(line 1418,col 52)",
        "(line 1419,col 9)-(line 1421,col 9)",
        "(line 1428,col 9)-(line 1432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(float, float)",
      "begin_line": 1467,
      "end_line": 1494,
      "comment": "\n     * \u003cp\u003eCompares two floats for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater than,\n     * less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     * \u003cli\u003eNaN\n     * \u003cli\u003ePositive infinity\n     * \u003cli\u003eMaximum float\n     * \u003cli\u003eNormal positive numbers\n     * \u003cli\u003e+0.0\n     * \u003cli\u003e-0.0\n     * \u003cli\u003eNormal negative numbers\n     * \u003cli\u003eMinimum float (\u003ccode\u003e-Float.MAX_VALUE\u003c/code\u003e)\n     * \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will return\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003efloat\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1468,col 9)-(line 1470,col 9)",
        "(line 1471,col 9)-(line 1473,col 9)",
        "(line 1478,col 9)-(line 1478,col 48)",
        "(line 1479,col 9)-(line 1479,col 48)",
        "(line 1480,col 9)-(line 1482,col 9)",
        "(line 1489,col 9)-(line 1493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 1507,
      "end_line": 1517,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only unicode numeric\n     ",
      "child_ranges": [
        "(line 1508,col 9)-(line 1510,col 9)",
        "(line 1511,col 9)-(line 1515,col 9)",
        "(line 1516,col 9)-(line 1516,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 1532,
      "end_line": 1626,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 1533,col 9)-(line 1535,col 9)",
        "(line 1536,col 9)-(line 1536,col 41)",
        "(line 1537,col 9)-(line 1537,col 30)",
        "(line 1538,col 9)-(line 1538,col 31)",
        "(line 1539,col 9)-(line 1539,col 36)",
        "(line 1540,col 9)-(line 1540,col 35)",
        "(line 1541,col 9)-(line 1541,col 35)",
        "(line 1543,col 9)-(line 1543,col 46)",
        "(line 1544,col 9)-(line 1560,col 9)",
        "(line 1561,col 9)-(line 1561,col 13)",
        "(line 1563,col 9)-(line 1563,col 22)",
        "(line 1566,col 9)-(line 1598,col 9)",
        "(line 1599,col 9)-(line 1622,col 9)",
        "(line 1625,col 9)-(line 1625,col 41)"
      ]
    }
  ]
}