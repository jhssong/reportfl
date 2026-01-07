{
  "filepath": "/tmp/Lang-63b/src/java/org/apache/commons/lang/NumberUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 714,
      "comment": "\n * \u003cp\u003eProvides extra functionality for Java Number classes.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:bayard@generationjava.com\"\u003eHenri Yandell\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:rand_mcneely@yahoo.com\"\u003eRand McNeely\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:steve.downey@netfolio.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Eric Pugh\n * @author Phil Steitz\n * @since 1.0\n * @version $Id$\n * \n * @deprecated Moved to org.apache.commons.lang.math.\n *             Class will be removed in Commons Lang 3.0.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NumberUtils.NumberUtils()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eNumberUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eNumberUtils.stringToInt(\"6\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 48,col 7)-(line 48,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.stringToInt(java.lang.String)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning\n     * \u003ccode\u003ezero\u003c/code\u003e if the conversion fails.\u003c/p\u003e\n     * \n     * @param str  the string to convert\n     * @return the int represented by the string, or \u003ccode\u003ezero\u003c/code\u003e if\n     *  conversion fails\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.stringToInt(java.lang.String, int)",
      "begin_line": 73,
      "end_line": 79,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to an \u003ccode\u003eint\u003c/code\u003e, returning a\n     * default value if the conversion fails.\u003c/p\u003e\n     * \n     * @param str  the string to convert\n     * @param defaultValue  the default value\n     * @return the int represented by the string, or the default if conversion fails\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 78,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createNumber(java.lang.String)",
      "begin_line": 139,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eTurns a string value into a java.lang.Number.\u003c/p\u003e\n     *\n     * \u003cp\u003eFirst, the value is examined for a type qualifier on the end\n     * (\u003ccode\u003e\u0027f\u0027,\u0027F\u0027,\u0027d\u0027,\u0027D\u0027,\u0027l\u0027,\u0027L\u0027\u003c/code\u003e).  If it is found, it starts \n     * trying to create successively larger types from the type specified\n     * until one is found that can hold the value.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf a type specifier is not found, it will check for a decimal point\n     * and then try successively larger types from \u003ccode\u003eInteger\u003c/code\u003e to\n     * \u003ccode\u003eBigInteger\u003c/code\u003e and from \u003ccode\u003eFloat\u003c/code\u003e to\n     * \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the string starts with \u003ccode\u003e0x\u003c/code\u003e or \u003ccode\u003e-0x\u003c/code\u003e, it\n     * will be interpreted as a hexadecimal integer.  Values with leading\n     * \u003ccode\u003e0\u003c/code\u003e\u0027s will not be interpreted as octal.\u003c/p\u003e\n     *\n     * @param val String containing a number\n     * @return Number created from the string\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 53)",
        "(line 157,col 9)-(line 157,col 20)",
        "(line 158,col 9)-(line 158,col 19)",
        "(line 159,col 9)-(line 159,col 19)",
        "(line 160,col 9)-(line 160,col 38)",
        "(line 161,col 9)-(line 161,col 61)",
        "(line 163,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.isAllZeros(java.lang.String)",
      "begin_line": 298,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eUtility method for {@link #createNumber(java.lang.String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if s is \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param s the String to check\n     * @return if it is all zeros or \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createFloat(java.lang.String)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eFloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eFloat\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createDouble(java.lang.String)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eDouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eDouble\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createInteger(java.lang.String)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eInteger\u003c/code\u003e, handling\n     * hex and octal notations.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createLong(java.lang.String)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eLong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eLong\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createBigInteger(java.lang.String)",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigInteger\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eBigInteger\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 44)",
        "(line 367,col 9)-(line 367,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.createBigDecimal(java.lang.String)",
      "begin_line": 377,
      "end_line": 380,
      "comment": "\n     * \u003cp\u003eConvert a \u003ccode\u003eString\u003c/code\u003e to a \u003ccode\u003eBigDecimal\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param val  a \u003ccode\u003eString\u003c/code\u003e to convert\n     * @return converted \u003ccode\u003eBigDecimal\u003c/code\u003e\n     * @throws NumberFormatException if the value cannot be converted\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 44)",
        "(line 379,col 9)-(line 379,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.minimum(long, long, long)",
      "begin_line": 392,
      "end_line": 400,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.minimum(int, int, int)",
      "begin_line": 410,
      "end_line": 418,
      "comment": "\n     * \u003cp\u003eGets the minimum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the smallest of the values\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.maximum(long, long, long)",
      "begin_line": 428,
      "end_line": 436,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003elong\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.maximum(int, int, int)",
      "begin_line": 446,
      "end_line": 454,
      "comment": "\n     * \u003cp\u003eGets the maximum of three \u003ccode\u003eint\u003c/code\u003e values.\u003c/p\u003e\n     * \n     * @param a  value 1\n     * @param b  value 2\n     * @param c  value 3\n     * @return  the largest of the values\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 453,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.compare(double, double)",
      "begin_line": 492,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003eCompares two \u003ccode\u003edoubles\u003c/code\u003e for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater\n     * than, less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e\n     * The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     *  \u003cli\u003eNaN\n     *  \u003cli\u003ePositive infinity\n     *  \u003cli\u003eMaximum double\n     *  \u003cli\u003eNormal positive numbers\n     *  \u003cli\u003e+0.0\n     *  \u003cli\u003e-0.0\n     *  \u003cli\u003eNormal negative numbers\n     *  \u003cli\u003eMinimum double (-Double.MAX_VALUE)\n     *  \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will\n     * return \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003edouble\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003edouble\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 498,col 9)",
        "(line 503,col 9)-(line 503,col 52)",
        "(line 504,col 9)-(line 504,col 52)",
        "(line 505,col 9)-(line 507,col 9)",
        "(line 514,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.compare(float, float)",
      "begin_line": 553,
      "end_line": 580,
      "comment": "\n     * \u003cp\u003eCompares two floats for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method is more comprehensive than the standard Java greater than,\n     * less than and equals operators.\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003eIt returns \u003ccode\u003e-1\u003c/code\u003e if the first value is less than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e+1\u003c/code\u003e if the first value is greater than the second.\n     *  \u003cli\u003eIt returns \u003ccode\u003e0\u003c/code\u003e if the values are equal.\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003e The ordering is as follows, largest to smallest:\n     * \u003cul\u003e\n     * \u003cli\u003eNaN\n     * \u003cli\u003ePositive infinity\n     * \u003cli\u003eMaximum float\n     * \u003cli\u003eNormal positive numbers\n     * \u003cli\u003e+0.0\n     * \u003cli\u003e-0.0\n     * \u003cli\u003eNormal negative numbers\n     * \u003cli\u003eMinimum float (-Float.MAX_VALUE)\n     * \u003cli\u003eNegative infinity\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eComparing \u003ccode\u003eNaN\u003c/code\u003e with \u003ccode\u003eNaN\u003c/code\u003e will return\n     * \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param lhs  the first \u003ccode\u003efloat\u003c/code\u003e\n     * @param rhs  the second \u003ccode\u003efloat\u003c/code\u003e\n     * @return \u003ccode\u003e-1\u003c/code\u003e if lhs is less, \u003ccode\u003e+1\u003c/code\u003e if greater,\n     *  \u003ccode\u003e0\u003c/code\u003e if equal to rhs\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 564,col 9)-(line 564,col 48)",
        "(line 565,col 9)-(line 565,col 48)",
        "(line 566,col 9)-(line 568,col 9)",
        "(line 575,col 9)-(line 579,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.isDigits(java.lang.String)",
      "begin_line": 594,
      "end_line": 604,
      "comment": "\n     * \u003cp\u003eChecks whether the \u003ccode\u003eString\u003c/code\u003e contains only\n     * digit characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if str contains only unicode numeric\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberUtils.isNumber(java.lang.String)",
      "begin_line": 619,
      "end_line": 713,
      "comment": "\n     * \u003cp\u003eChecks whether the String a valid Java number.\u003c/p\u003e\n     *\n     * \u003cp\u003eValid numbers include hexadecimal marked with the \u003ccode\u003e0x\u003c/code\u003e\n     * qualifier, scientific notation and numbers marked with a type\n     * qualifier (e.g. 123L).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003eNull\u003c/code\u003e and empty String will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the \u003ccode\u003eString\u003c/code\u003e to check\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the string is a correctly formatted number\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 41)",
        "(line 624,col 9)-(line 624,col 30)",
        "(line 625,col 9)-(line 625,col 31)",
        "(line 626,col 9)-(line 626,col 36)",
        "(line 627,col 9)-(line 627,col 35)",
        "(line 628,col 9)-(line 628,col 35)",
        "(line 630,col 9)-(line 630,col 46)",
        "(line 631,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 13)",
        "(line 650,col 9)-(line 650,col 22)",
        "(line 653,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 709,col 9)",
        "(line 712,col 9)-(line 712,col 41)"
      ]
    }
  ]
}