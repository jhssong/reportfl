{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/math/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 1482,
      "comment": "\n * \u003cp\u003eProvides extra functionality for Java Number classes.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:rand_mcneely@yahoo.com\"\u003eRand McNeely\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Eric Pugh\n * @author Phil Steitz\n * @author Matthew Hawthorne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ZERO"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Reusable Long constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_ONE"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Reusable Long constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "LONG_MINUS_ONE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Reusable Long constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ZERO"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Reusable Integer constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_ONE"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Reusable Integer constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "INTEGER_MINUS_ONE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Reusable Integer constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ZERO"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Reusable Short constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_ONE"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Reusable Short constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_MINUS_ONE"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Reusable Short constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ZERO"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Reusable Byte constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_ONE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Reusable Byte constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MINUS_ONE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Reusable Byte constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ZERO"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Reusable Double constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_ONE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Reusable Double constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "DOUBLE_MINUS_ONE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Reusable Double constant for minus one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ZERO"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Reusable Float constant for zero. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_ONE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Reusable Float constant for one. "
    },
    {
      "type": "field",
      "varNames": [
        "FLOAT_MINUS_ONE"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Reusable Float constant for minus one. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.NumberUtils.NumberUtils()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eNumberUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eNumberUtils.stringToInt(\"6\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.stringToInt(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   NumberUtils.stringToInt(null) \u003d 0\n     *   NumberUtils.stringToInt(\"\")   \u003d 0\n     *   NumberUtils.stringToInt(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @deprecated Use {@link #toInt(String)}\n     *  This method will be removed in Commons Lang 3.0\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toInt(java.lang.String)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null) \u003d 0\n     *   NumberUtils.toInt(\"\")   \u003d 0\n     *   NumberUtils.toInt(\"1\")  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.stringToInt(java.lang.String, int)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   NumberUtils.stringToInt(null, 1) \u003d 1\n     *   NumberUtils.stringToInt(\"\", 1)   \u003d 1\n     *   NumberUtils.stringToInt(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     * @deprecated Use {@link #toInt(String, int)}\n     *  This method will be removed in Commons Lang 3.0\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toInt(java.lang.String, int)",
      "begin_line": 171,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toInt(null, 1) \u003d 1\n     *   NumberUtils.toInt(\"\", 1)   \u003d 1\n     *   NumberUtils.toInt(\"1\", 0)  \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toLong(java.lang.String)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003ezero\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null) \u003d 0L\n     *   NumberUtils.toLong(\"\")   \u003d 0L\n     *   NumberUtils.toLong(\"1\")  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @return the long represented by the string, or \u003ccode\u003e0\u003c/code\u003e if\n     *  conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toLong(java.lang.String, long)",
      "begin_line": 220,
      "end_line": 229,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003elong\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string is \u003ccode\u003enull\u003c/code\u003e, the default value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toLong(null, 1L) \u003d 1L\n     *   NumberUtils.toLong(\"\", 1L)   \u003d 1L\n     *   NumberUtils.toLong(\"1\", 0L)  \u003d 1L\n     * \u003c/pre\u003e\n     *\n     * @param str  the string to convert, may be null\n     * @param defaultValue  the default value\n     * @return the long represented by the string, or the default if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toFloat(java.lang.String)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0f\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0f\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null)   \u003d 0.0f\n     *   NumberUtils.toFloat(\"\")     \u003d 0.0f\n     *   NumberUtils.toFloat(\"1.5\")  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the float represented by the string, or \u003ccode\u003e0.0f\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toFloat(java.lang.String, float)",
      "begin_line": 272,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003efloat\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toFloat(null, 1.1f)   \u003d 1.0f\n     *   NumberUtils.toFloat(\"\", 1.1f)     \u003d 1.1f\n     *   NumberUtils.toFloat(\"1.5\", 0.0f)  \u003d 1.5f\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the float represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 273,col 7)-(line 275,col 7)",
        "(line 276,col 7)-(line 280,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toDouble(java.lang.String)",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning\n     * \u003ccode\u003e0.0d\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e,\n     * \u003ccode\u003e0.0d\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null)   \u003d 0.0d\n     *   NumberUtils.toDouble(\"\")     \u003d 0.0d\n     *   NumberUtils.toDouble(\"1.5\")  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the double represented by the string, or \u003ccode\u003e0.0d\u003c/code\u003e\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.toDouble(java.lang.String, double)",
      "begin_line": 324,
      "end_line": 333,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003edouble\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string \u003ccode\u003estr\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e, the default\n     * value is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   NumberUtils.toDouble(null, 1.1d)   \u003d 1.1d\n     *   NumberUtils.toDouble(\"\", 1.1d)     \u003d 1.1d\n     *   NumberUtils.toDouble(\"1.5\", 0.0d)  \u003d 1.5d\n     * \u003c/pre\u003e\n     *\n     * @param str the string to convert, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param defaultValue the default value\n     * @return the double represented by the string, or defaultValue\n     *  if conversion fails\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 325,col 7)-(line 327,col 7)",
        "(line 328,col 7)-(line 332,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createNumber(java.lang.String)",
      "begin_line": 397,
      "end_line": 544,
      "comment": "\n     * \u003cp\u003eTurns a string value into a java.lang.Number.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst, the value is examined for a type qualifier on the end\n     * (\u003ccode\u003e\u0027f\u0027,\u0027F\u0027,\u0027d\u0027,\u0027D\u0027,\u0027l\u0027,\u0027L\u0027\u003c/code\u003e).  If it is found, it starts \n     * trying to create successively larger types from the type specified\n     * until one is found that can represent the value.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a type specifier is not found, it will check for a decimal point\n     * and then try successively larger types from \u003ccode\u003eInteger\u003c/code\u003e to\n     * \u003ccode\u003eBigInteger\u003c/code\u003e and from \u003ccode\u003eFloat\u003c/code\u003e to\n     * \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string starts with \u003ccode\u003e0x\u003c/code\u003e or \u003ccode\u003e-0x\u003c/code\u003e, it\n     * will be interpreted as a hexadecimal integer.  Values with leading\n     * \u003ccode\u003e0\u003c/code\u003e\u0027s will not be interpreted as octal.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method does not trim the input string, i.e., strings with leading\n     * or trailing spaces will generate NumberFormatExceptions.\u003c/p\u003e\n     *\n     * @param str  String containing a number, may be null\n     * @return Number created from the string\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 53)",
        "(line 415,col 9)-(line 415,col 20)",
        "(line 416,col 9)-(line 416,col 19)",
        "(line 417,col 9)-(line 417,col 19)",
        "(line 418,col 9)-(line 418,col 38)",
        "(line 419,col 9)-(line 419,col 61)",
        "(line 421,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 543,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isAllZeros(java.lang.String)",
      "begin_line": 554,
      "end_line": 564,
      "comment": "\n     * \u003cp\u003eUtility method for {@link #createNumber(java.lang.String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if s is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  the String to check\n     * @return if it is all zeros or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createFloat(java.lang.String)",
      "begin_line": 576,
      "end_line": 581,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eFloat\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eFloat\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createDouble(java.lang.String)",
      "begin_line": 592,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eDouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eDouble\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createInteger(java.lang.String)",
      "begin_line": 609,
      "end_line": 615,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eInteger\u003c/code\u003e, handling\n     * hex and octal notations.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 9)",
        "(line 614,col 9)-(line 614,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createLong(java.lang.String)",
      "begin_line": 626,
      "end_line": 631,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eLong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eLong\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createBigInteger(java.lang.String)",
      "begin_line": 642,
      "end_line": 647,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigInteger\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.createBigDecimal(java.lang.String)",
      "begin_line": 658,
      "end_line": 667,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eReturns \u003ccode\u003enull\u003c/code\u003e if the string is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  a \u003ccode\u003eString\u003c/code\u003e to convert, may be null\n     * @return converted \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 663,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long[])",
      "begin_line": 679,
      "end_line": 696,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 685,col 9)",
        "(line 688,col 9)-(line 688,col 28)",
        "(line 689,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int[])",
      "begin_line": 706,
      "end_line": 723,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 712,col 9)",
        "(line 715,col 9)-(line 715,col 27)",
        "(line 716,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 722,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short[])",
      "begin_line": 733,
      "end_line": 750,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 739,col 9)",
        "(line 742,col 9)-(line 742,col 29)",
        "(line 743,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(byte[])",
      "begin_line": 760,
      "end_line": 777,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 766,col 9)",
        "(line 769,col 9)-(line 769,col 28)",
        "(line 770,col 9)-(line 774,col 9)",
        "(line 776,col 9)-(line 776,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double[])",
      "begin_line": 788,
      "end_line": 808,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 794,col 9)",
        "(line 797,col 9)-(line 797,col 30)",
        "(line 798,col 9)-(line 805,col 9)",
        "(line 807,col 9)-(line 807,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float[])",
      "begin_line": 819,
      "end_line": 839,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#min(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 825,col 9)",
        "(line 828,col 9)-(line 828,col 29)",
        "(line 829,col 9)-(line 836,col 9)",
        "(line 838,col 9)-(line 838,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long[])",
      "begin_line": 851,
      "end_line": 868,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 857,col 9)",
        "(line 860,col 9)-(line 860,col 28)",
        "(line 861,col 9)-(line 865,col 9)",
        "(line 867,col 9)-(line 867,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int[])",
      "begin_line": 878,
      "end_line": 895,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 884,col 9)",
        "(line 887,col 9)-(line 887,col 27)",
        "(line 888,col 9)-(line 892,col 9)",
        "(line 894,col 9)-(line 894,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short[])",
      "begin_line": 905,
      "end_line": 922,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 911,col 9)",
        "(line 914,col 9)-(line 914,col 29)",
        "(line 915,col 9)-(line 919,col 9)",
        "(line 921,col 9)-(line 921,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(byte[])",
      "begin_line": 932,
      "end_line": 949,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 938,col 9)",
        "(line 941,col 9)-(line 941,col 28)",
        "(line 942,col 9)-(line 946,col 9)",
        "(line 948,col 9)-(line 948,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double[])",
      "begin_line": 960,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(double[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 966,col 9)",
        "(line 969,col 9)-(line 969,col 30)",
        "(line 970,col 9)-(line 977,col 9)",
        "(line 979,col 9)-(line 979,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float[])",
      "begin_line": 991,
      "end_line": 1011,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     * @see IEEE754rUtils#max(float[]) IEEE754rUtils for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 997,col 9)",
        "(line 1000,col 9)-(line 1000,col 29)",
        "(line 1001,col 9)-(line 1008,col 9)",
        "(line 1010,col 9)-(line 1010,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long, long, long)",
      "begin_line": 1023,
      "end_line": 1031,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1026,col 9)",
        "(line 1027,col 9)-(line 1029,col 9)",
        "(line 1030,col 9)-(line 1030,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int, int, int)",
      "begin_line": 1041,
      "end_line": 1049,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1044,col 9)",
        "(line 1045,col 9)-(line 1047,col 9)",
        "(line 1048,col 9)-(line 1048,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short, short, short)",
      "begin_line": 1059,
      "end_line": 1067,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1066,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(byte, byte, byte)",
      "begin_line": 1077,
      "end_line": 1085,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double, double, double)",
      "begin_line": 1099,
      "end_line": 1101,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float, float, float)",
      "begin_line": 1115,
      "end_line": 1117,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     * @see IEEE754rUtils#min(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1116,col 9)-(line 1116,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long, long, long)",
      "begin_line": 1129,
      "end_line": 1137,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1135,col 9)",
        "(line 1136,col 9)-(line 1136,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int, int, int)",
      "begin_line": 1147,
      "end_line": 1155,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1153,col 9)",
        "(line 1154,col 9)-(line 1154,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short, short, short)",
      "begin_line": 1165,
      "end_line": 1173,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1168,col 9)",
        "(line 1169,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(byte, byte, byte)",
      "begin_line": 1183,
      "end_line": 1191,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1186,col 9)",
        "(line 1187,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1190,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double, double, double)",
      "begin_line": 1205,
      "end_line": 1207,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(double, double, double) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1206,col 9)-(line 1206,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float, float, float)",
      "begin_line": 1221,
      "end_line": 1223,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     * @see IEEE754rUtils#max(float, float, float) for a version of this method that handles NaN differently\n     ",
      "child_ranges": [
        "(line 1222,col 9)-(line 1222,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(double, double)",
      "begin_line": 1260,
      "end_line": 1287,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003edoubles\u003c/code\u003e for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater\n     * than, less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e\n     * The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     *  \u003cli\u003eNaN\n     *  \u003cli\u003ePositive infinity\n     *  \u003cli\u003eMaximum double\n     *  \u003cli\u003eNormal positive numbers\n     *  \u003cli\u003e+0.0\n     *  \u003cli\u003e-0.0\n     *  \u003cli\u003eNormal negative numbers\n     *  \u003cli\u003eMinimum double (\u003ccode\u003e-Double.MAX_VALUE\u003c/code\u003e)\n     *  \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will\n     * return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003edouble\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1264,col 9)-(line 1266,col 9)",
        "(line 1271,col 9)-(line 1271,col 52)",
        "(line 1272,col 9)-(line 1272,col 52)",
        "(line 1273,col 9)-(line 1275,col 9)",
        "(line 1282,col 9)-(line 1286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(float, float)",
      "begin_line": 1321,
      "end_line": 1348,
      "comment": "\n     * \u003cp\u003eCompares two floats for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater than,\n     * less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     * \u003cli\u003eNaN\n     * \u003cli\u003ePositive infinity\n     * \u003cli\u003eMaximum float\n     * \u003cli\u003eNormal positive numbers\n     * \u003cli\u003e+0.0\n     * \u003cli\u003e-0.0\n     * \u003cli\u003eNormal negative numbers\n     * \u003cli\u003eMinimum float (\u003ccode\u003e-Float.MAX_VALUE\u003c/code\u003e)\n     * \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will return\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003efloat\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1324,col 9)",
        "(line 1325,col 9)-(line 1327,col 9)",
        "(line 1332,col 9)-(line 1332,col 48)",
        "(line 1333,col 9)-(line 1333,col 48)",
        "(line 1334,col 9)-(line 1336,col 9)",
        "(line 1343,col 9)-(line 1347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 1361,
      "end_line": 1371,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only unicode numeric\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1364,col 9)",
        "(line 1365,col 9)-(line 1369,col 9)",
        "(line 1370,col 9)-(line 1370,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 1386,
      "end_line": 1480,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1389,col 9)",
        "(line 1390,col 9)-(line 1390,col 41)",
        "(line 1391,col 9)-(line 1391,col 30)",
        "(line 1392,col 9)-(line 1392,col 31)",
        "(line 1393,col 9)-(line 1393,col 36)",
        "(line 1394,col 9)-(line 1394,col 35)",
        "(line 1395,col 9)-(line 1395,col 35)",
        "(line 1397,col 9)-(line 1397,col 46)",
        "(line 1398,col 9)-(line 1414,col 9)",
        "(line 1415,col 9)-(line 1415,col 13)",
        "(line 1417,col 9)-(line 1417,col 22)",
        "(line 1420,col 9)-(line 1452,col 9)",
        "(line 1453,col 9)-(line 1476,col 9)",
        "(line 1479,col 9)-(line 1479,col 41)"
      ]
    }
  ]
}