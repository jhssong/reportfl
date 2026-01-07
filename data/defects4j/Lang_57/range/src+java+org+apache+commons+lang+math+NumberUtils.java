{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/math/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 1626,
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
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(byte[], byte[])",
      "begin_line": 678,
      "end_line": 696,
      "comment": "\n     * \u003cp\u003eWhether the contents of two byte[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(short[], short[])",
      "begin_line": 705,
      "end_line": 723,
      "comment": "\n     * \u003cp\u003eWhether the contents of two short[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 722,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(int[], int[])",
      "begin_line": 732,
      "end_line": 750,
      "comment": "\n     * \u003cp\u003eWhether the contents of two int[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 741,col 9)",
        "(line 743,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(long[], long[])",
      "begin_line": 759,
      "end_line": 777,
      "comment": "\n     * \u003cp\u003eWhether the contents of two long[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 760,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 774,col 9)",
        "(line 776,col 9)-(line 776,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(float[], float[])",
      "begin_line": 786,
      "end_line": 804,
      "comment": "\n     * \u003cp\u003eWhether the contents of two float[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 801,col 9)",
        "(line 803,col 9)-(line 803,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.equals(double[], double[])",
      "begin_line": 813,
      "end_line": 831,
      "comment": "\n     * \u003cp\u003eWhether the contents of two double[] arrays are equal.\u003c/p\u003e\n     * \n     * @param array1  first array to compare\n     * @param array2  second array to compare\n     * @return whether the two arrays are equal\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 822,col 9)",
        "(line 824,col 9)-(line 828,col 9)",
        "(line 830,col 9)-(line 830,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long[])",
      "begin_line": 843,
      "end_line": 860,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 849,col 9)",
        "(line 852,col 9)-(line 852,col 28)",
        "(line 853,col 9)-(line 857,col 9)",
        "(line 859,col 9)-(line 859,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int[])",
      "begin_line": 870,
      "end_line": 887,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 876,col 9)",
        "(line 879,col 9)-(line 879,col 27)",
        "(line 880,col 9)-(line 884,col 9)",
        "(line 886,col 9)-(line 886,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short[])",
      "begin_line": 897,
      "end_line": 914,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 903,col 9)",
        "(line 906,col 9)-(line 906,col 29)",
        "(line 907,col 9)-(line 911,col 9)",
        "(line 913,col 9)-(line 913,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(byte[])",
      "begin_line": 924,
      "end_line": 941,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 930,col 9)",
        "(line 933,col 9)-(line 933,col 28)",
        "(line 934,col 9)-(line 938,col 9)",
        "(line 940,col 9)-(line 940,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double[])",
      "begin_line": 951,
      "end_line": 968,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 957,col 9)",
        "(line 960,col 9)-(line 960,col 30)",
        "(line 961,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 967,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float[])",
      "begin_line": 978,
      "end_line": 995,
      "comment": "\n     * \u003cp\u003eReturns the minimum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 984,col 9)",
        "(line 987,col 9)-(line 987,col 29)",
        "(line 988,col 9)-(line 992,col 9)",
        "(line 994,col 9)-(line 994,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long[])",
      "begin_line": 1007,
      "end_line": 1024,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1013,col 9)",
        "(line 1016,col 9)-(line 1016,col 28)",
        "(line 1017,col 9)-(line 1021,col 9)",
        "(line 1023,col 9)-(line 1023,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int[])",
      "begin_line": 1034,
      "end_line": 1051,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1040,col 9)",
        "(line 1043,col 9)-(line 1043,col 27)",
        "(line 1044,col 9)-(line 1048,col 9)",
        "(line 1050,col 9)-(line 1050,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short[])",
      "begin_line": 1061,
      "end_line": 1078,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1067,col 9)",
        "(line 1070,col 9)-(line 1070,col 29)",
        "(line 1071,col 9)-(line 1075,col 9)",
        "(line 1077,col 9)-(line 1077,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(byte[])",
      "begin_line": 1088,
      "end_line": 1105,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1090,col 9)-(line 1094,col 9)",
        "(line 1097,col 9)-(line 1097,col 28)",
        "(line 1098,col 9)-(line 1102,col 9)",
        "(line 1104,col 9)-(line 1104,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double[])",
      "begin_line": 1115,
      "end_line": 1132,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1117,col 9)-(line 1121,col 9)",
        "(line 1124,col 9)-(line 1124,col 30)",
        "(line 1125,col 9)-(line 1129,col 9)",
        "(line 1131,col 9)-(line 1131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float[])",
      "begin_line": 1142,
      "end_line": 1159,
      "comment": "\n     * \u003cp\u003eReturns the maximum value in an array.\u003c/p\u003e\n     * \n     * @param array  an array, must not be null or empty\n     * @return the minimum value in the array\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1148,col 9)",
        "(line 1151,col 9)-(line 1151,col 29)",
        "(line 1152,col 9)-(line 1156,col 9)",
        "(line 1158,col 9)-(line 1158,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(long, long, long)",
      "begin_line": 1171,
      "end_line": 1179,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1172,col 9)-(line 1174,col 9)",
        "(line 1175,col 9)-(line 1177,col 9)",
        "(line 1178,col 9)-(line 1178,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(int, int, int)",
      "begin_line": 1189,
      "end_line": 1197,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1192,col 9)",
        "(line 1193,col 9)-(line 1195,col 9)",
        "(line 1196,col 9)-(line 1196,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(short, short, short)",
      "begin_line": 1207,
      "end_line": 1215,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1210,col 9)",
        "(line 1211,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1214,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(byte, byte, byte)",
      "begin_line": 1225,
      "end_line": 1233,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1228,col 9)",
        "(line 1229,col 9)-(line 1231,col 9)",
        "(line 1232,col 9)-(line 1232,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(double, double, double)",
      "begin_line": 1246,
      "end_line": 1248,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.min(float, float, float)",
      "begin_line": 1261,
      "end_line": 1263,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(long, long, long)",
      "begin_line": 1275,
      "end_line": 1283,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1276,col 9)-(line 1278,col 9)",
        "(line 1279,col 9)-(line 1281,col 9)",
        "(line 1282,col 9)-(line 1282,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(int, int, int)",
      "begin_line": 1293,
      "end_line": 1301,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1294,col 9)-(line 1296,col 9)",
        "(line 1297,col 9)-(line 1299,col 9)",
        "(line 1300,col 9)-(line 1300,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(short, short, short)",
      "begin_line": 1311,
      "end_line": 1319,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eshort\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1318,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(byte, byte, byte)",
      "begin_line": 1329,
      "end_line": 1337,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003ebyte\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1335,col 9)",
        "(line 1336,col 9)-(line 1336,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(double, double, double)",
      "begin_line": 1350,
      "end_line": 1352,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003edouble\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1351,col 9)-(line 1351,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.max(float, float, float)",
      "begin_line": 1365,
      "end_line": 1367,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003efloat\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf any value is \u003ccode\u003eNaN\u003c/code\u003e, \u003ccode\u003eNaN\u003c/code\u003e is\n     * returned. Infinity is handled.\u003c/p\u003e\n     *\n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 1366,col 9)-(line 1366,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(double, double)",
      "begin_line": 1404,
      "end_line": 1431,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003edoubles\u003c/code\u003e for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater\n     * than, less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\u003c/li\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e\n     * The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     *  \u003cli\u003eNaN\n     *  \u003cli\u003ePositive infinity\n     *  \u003cli\u003eMaximum double\n     *  \u003cli\u003eNormal positive numbers\n     *  \u003cli\u003e+0.0\n     *  \u003cli\u003e-0.0\n     *  \u003cli\u003eNormal negative numbers\n     *  \u003cli\u003eMinimum double (\u003ccode\u003e-Double.MAX_VALUE\u003c/code\u003e)\n     *  \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will\n     * return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003edouble\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1405,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1410,col 9)",
        "(line 1415,col 9)-(line 1415,col 52)",
        "(line 1416,col 9)-(line 1416,col 52)",
        "(line 1417,col 9)-(line 1419,col 9)",
        "(line 1426,col 9)-(line 1430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.compare(float, float)",
      "begin_line": 1465,
      "end_line": 1492,
      "comment": "\n     * \u003cp\u003eCompares two floats for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater than,\n     * less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     * \u003cli\u003eNaN\n     * \u003cli\u003ePositive infinity\n     * \u003cli\u003eMaximum float\n     * \u003cli\u003eNormal positive numbers\n     * \u003cli\u003e+0.0\n     * \u003cli\u003e-0.0\n     * \u003cli\u003eNormal negative numbers\n     * \u003cli\u003eMinimum float (\u003ccode\u003e-Float.MAX_VALUE\u003c/code\u003e)\n     * \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will return\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003efloat\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 1466,col 9)-(line 1468,col 9)",
        "(line 1469,col 9)-(line 1471,col 9)",
        "(line 1476,col 9)-(line 1476,col 48)",
        "(line 1477,col 9)-(line 1477,col 48)",
        "(line 1478,col 9)-(line 1480,col 9)",
        "(line 1487,col 9)-(line 1491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 1505,
      "end_line": 1515,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only unicode numeric\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1508,col 9)",
        "(line 1509,col 9)-(line 1513,col 9)",
        "(line 1514,col 9)-(line 1514,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 1530,
      "end_line": 1624,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 1531,col 9)-(line 1533,col 9)",
        "(line 1534,col 9)-(line 1534,col 41)",
        "(line 1535,col 9)-(line 1535,col 30)",
        "(line 1536,col 9)-(line 1536,col 31)",
        "(line 1537,col 9)-(line 1537,col 36)",
        "(line 1538,col 9)-(line 1538,col 35)",
        "(line 1539,col 9)-(line 1539,col 35)",
        "(line 1541,col 9)-(line 1541,col 46)",
        "(line 1542,col 9)-(line 1558,col 9)",
        "(line 1559,col 9)-(line 1559,col 13)",
        "(line 1561,col 9)-(line 1561,col 22)",
        "(line 1564,col 9)-(line 1596,col 9)",
        "(line 1597,col 9)-(line 1620,col 9)",
        "(line 1623,col 9)-(line 1623,col 41)"
      ]
    }
  ]
}