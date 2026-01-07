{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/math/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 431,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eRange\u003c/code\u003e represents a range of numbers of the same type.\u003c/p\u003e\n * \n * \u003cp\u003eSpecific subclasses hold the range values as different types. Each\n * subclass should be immutable and {@link java.io.Serializable Serializable}\n * if possible.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.Range.Range()",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * \u003cp\u003eConstructs a new range.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumNumber()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumLong()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumInteger()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumDouble()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumFloat()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumNumber()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumLong()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumInteger()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumDouble()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumFloat()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsNumber(java.lang.Number)",
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe exact comparison implementation varies by subclass. It is\n     * intended that an \u003ccode\u003eint\u003c/code\u003e specific subclass will compare using\n     * \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     * @throws IllegalArgumentException if the \u003ccode\u003eNumber\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsLong(java.lang.Number)",
      "begin_line": 183,
      "end_line": 188,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison..\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsLong(long)} method.\u003c/p\u003e\n     *\n     * @param value  the long to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsLong(long)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003elong\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumLong()} and \n     * {@link #getMaximumLong()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the long to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsInteger(java.lang.Number)",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison..\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsInteger(int)} method.\u003c/p\u003e\n     *\n     * @param value  the integer to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003eint\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsInteger(int)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eint\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumInteger()} and \n     * {@link #getMaximumInteger()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the int to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003eint\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsDouble(java.lang.Number)",
      "begin_line": 251,
      "end_line": 256,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison..\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsDouble(double)} method.\u003c/p\u003e\n     *\n     * @param value  the double to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003edouble\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsDouble(double)",
      "begin_line": 269,
      "end_line": 273,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003edouble\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumDouble()} and \n     * {@link #getMaximumDouble()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the double to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003edouble\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 72)",
        "(line 271,col 9)-(line 271,col 72)",
        "(line 272,col 9)-(line 272,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsFloat(java.lang.Number)",
      "begin_line": 287,
      "end_line": 292,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsFloat(float)} method.\u003c/p\u003e\n     *\n     * @param value  the float to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003efloat\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsFloat(float)",
      "begin_line": 305,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003efloat\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumFloat()} and \n     * {@link #getMaximumFloat()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the float to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003efloat\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 71)",
        "(line 307,col 9)-(line 307,col 71)",
        "(line 308,col 9)-(line 308,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 331,
      "end_line": 337,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe exact comparison implementation varies by subclass. It is\n     * intended that an \u003ccode\u003eint\u003c/code\u003e specific subclass will compare using\n     * \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #containsNumber(Number)} method.\n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within\n     *  this range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 336,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 357,
      "end_line": 364,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe exact comparison implementation varies by subclass. It is\n     * intended that an \u003ccode\u003eint\u003c/code\u003e specific subclass will compare using\n     * \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #containsNumber(Number)} and\n     * {@link #containsRange(Range)} methods.\n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 363,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.equals(java.lang.Object)",
      "begin_line": 381,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} and \n     * {@link #getMaximumNumber()} methods. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.hashCode()",
      "begin_line": 402,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} and \n     * {@link #getMaximumNumber()} methods. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 24)",
        "(line 404,col 9)-(line 404,col 53)",
        "(line 405,col 9)-(line 405,col 61)",
        "(line 406,col 9)-(line 406,col 61)",
        "(line 407,col 9)-(line 407,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.toString()",
      "begin_line": 421,
      "end_line": 429,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} and \n     * {@link #getMaximumNumber()} methods. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 48)",
        "(line 423,col 9)-(line 423,col 29)",
        "(line 424,col 9)-(line 424,col 39)",
        "(line 425,col 9)-(line 425,col 24)",
        "(line 426,col 9)-(line 426,col 39)",
        "(line 427,col 9)-(line 427,col 24)",
        "(line 428,col 9)-(line 428,col 30)"
      ]
    }
  ]
}