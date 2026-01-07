{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 713,
      "comment": "\n * \u003cp\u003eProvides extra functionality for Java Number classes.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:bayard@generationjava.com\"\u003eHenri Yandell\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:rand_mcneely@yahoo.com\"\u003eRand McNeely\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Eric Pugh\n * @author Phil Steitz\n * @since 1.0\n * @version $Id$\n * \n * @deprecated Moved to org.apache.commons.lang.math.\n *             Class will be removed in Commons Lang 3.0.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NumberUtils.NumberUtils()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eNumberUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eNumberUtils.stringToInt(\"6\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 47,col 7)-(line 47,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.stringToInt(java.lang.String)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     * \n     * @param str  the string to convert\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.stringToInt(java.lang.String, int)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     * \n     * @param str  the string to convert\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createNumber(java.lang.String)",
      "begin_line": 138,
      "end_line": 287,
      "comment": "\n     * \u003cp\u003eTurns a string value into a java.lang.Number.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst, the value is examined for a type qualifier on the end\n     * (\u003ccode\u003e\u0027f\u0027,\u0027F\u0027,\u0027d\u0027,\u0027D\u0027,\u0027l\u0027,\u0027L\u0027\u003c/code\u003e).  If it is found, it starts \n     * trying to create successively larger types from the type specified\n     * until one is found that can hold the value.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a type specifier is not found, it will check for a decimal point\n     * and then try successively larger types from \u003ccode\u003eInteger\u003c/code\u003e to\n     * \u003ccode\u003eBigInteger\u003c/code\u003e and from \u003ccode\u003eFloat\u003c/code\u003e to\n     * \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string starts with \u003ccode\u003e0x\u003c/code\u003e or \u003ccode\u003e-0x\u003c/code\u003e, it\n     * will be interpreted as a hexadecimal integer.  Values with leading\n     * \u003ccode\u003e0\u003c/code\u003e\u0027s will not be interpreted as octal.\u003c/p\u003e\n     *\n     * @param val String containing a number\n     * @return Number created from the string\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 53)",
        "(line 156,col 9)-(line 156,col 20)",
        "(line 157,col 9)-(line 157,col 19)",
        "(line 158,col 9)-(line 158,col 19)",
        "(line 159,col 9)-(line 159,col 38)",
        "(line 160,col 9)-(line 160,col 61)",
        "(line 162,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 286,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.isAllZeros(java.lang.String)",
      "begin_line": 297,
      "end_line": 307,
      "comment": "\n     * \u003cp\u003eUtility method for {@link #createNumber(java.lang.String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if s is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param s the String to check\n     * @return if it is all zeros or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createFloat(java.lang.String)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eFloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eFloat\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createDouble(java.lang.String)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eDouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eDouble\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createInteger(java.lang.String)",
      "begin_line": 341,
      "end_line": 344,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eInteger\u003c/code\u003e, handling\n     * hex and octal notations.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createLong(java.lang.String)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eLong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eLong\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createBigInteger(java.lang.String)",
      "begin_line": 364,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigInteger\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eBigInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 44)",
        "(line 366,col 9)-(line 366,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createBigDecimal(java.lang.String)",
      "begin_line": 376,
      "end_line": 379,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 44)",
        "(line 378,col 9)-(line 378,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.minimum(long, long, long)",
      "begin_line": 391,
      "end_line": 399,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 398,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.minimum(int, int, int)",
      "begin_line": 409,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.maximum(long, long, long)",
      "begin_line": 427,
      "end_line": 435,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.maximum(int, int, int)",
      "begin_line": 445,
      "end_line": 453,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.compare(double, double)",
      "begin_line": 491,
      "end_line": 518,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003edoubles\u003c/code\u003e for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater\n     * than, less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e\n     * The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     *  \u003cli\u003eNaN\n     *  \u003cli\u003ePositive infinity\n     *  \u003cli\u003eMaximum double\n     *  \u003cli\u003eNormal positive numbers\n     *  \u003cli\u003e+0.0\n     *  \u003cli\u003e-0.0\n     *  \u003cli\u003eNormal negative numbers\n     *  \u003cli\u003eMinimum double (-Double.MAX_VALUE)\n     *  \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will\n     * return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003edouble\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 502,col 9)-(line 502,col 52)",
        "(line 503,col 9)-(line 503,col 52)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 513,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.compare(float, float)",
      "begin_line": 552,
      "end_line": 579,
      "comment": "\n     * \u003cp\u003eCompares two floats for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater than,\n     * less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     * \u003cli\u003eNaN\n     * \u003cli\u003ePositive infinity\n     * \u003cli\u003eMaximum float\n     * \u003cli\u003eNormal positive numbers\n     * \u003cli\u003e+0.0\n     * \u003cli\u003e-0.0\n     * \u003cli\u003eNormal negative numbers\n     * \u003cli\u003eMinimum float (-Float.MAX_VALUE)\n     * \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will return\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003efloat\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 563,col 9)-(line 563,col 48)",
        "(line 564,col 9)-(line 564,col 48)",
        "(line 565,col 9)-(line 567,col 9)",
        "(line 574,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 593,
      "end_line": 603,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only unicode numeric\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 602,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 618,
      "end_line": 712,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 41)",
        "(line 623,col 9)-(line 623,col 30)",
        "(line 624,col 9)-(line 624,col 31)",
        "(line 625,col 9)-(line 625,col 36)",
        "(line 626,col 9)-(line 626,col 35)",
        "(line 627,col 9)-(line 627,col 35)",
        "(line 629,col 9)-(line 629,col 46)",
        "(line 630,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 13)",
        "(line 649,col 9)-(line 649,col 22)",
        "(line 652,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 708,col 9)",
        "(line 711,col 9)-(line 711,col 41)"
      ]
    }
  ]
}