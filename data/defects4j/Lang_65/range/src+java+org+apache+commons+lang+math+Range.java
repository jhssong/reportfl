{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/math/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 430,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eRange\u003c/code\u003e represents a range of numbers of the same type.\u003c/p\u003e\n * \n * \u003cp\u003eSpecific subclasses hold the range values as different types. Each\n * subclass should be immutable and {@link java.io.Serializable Serializable}\n * if possible.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.Range.Range()",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * \u003cp\u003eConstructs a new range.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumNumber()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumLong()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumInteger()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumDouble()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMinimumFloat()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * \u003cp\u003eGets the minimum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumNumber()",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumLong()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003elong\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumInteger()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003eint\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumDouble()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003edouble\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.getMaximumFloat()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eGets the maximum number in this range as a \u003ccode\u003efloat\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMaximumNumber()} method. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsNumber(java.lang.Number)",
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe exact comparison implementation varies by subclass. It is\n     * intended that an \u003ccode\u003eint\u003c/code\u003e specific subclass will compare using\n     * \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param number  the number to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this range\n     * @throws IllegalArgumentException if the \u003ccode\u003eNumber\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsLong(java.lang.Number)",
      "begin_line": 182,
      "end_line": 187,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison..\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsLong(long)} method.\u003c/p\u003e\n     *\n     * @param value  the long to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsLong(long)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003elong\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003elong\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumLong()} and \n     * {@link #getMaximumLong()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the long to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003elong\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsInteger(java.lang.Number)",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison..\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsInteger(int)} method.\u003c/p\u003e\n     *\n     * @param value  the integer to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003eint\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsInteger(int)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eint\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumInteger()} and \n     * {@link #getMaximumInteger()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the int to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003eint\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsDouble(java.lang.Number)",
      "begin_line": 250,
      "end_line": 255,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison..\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsDouble(double)} method.\u003c/p\u003e\n     *\n     * @param value  the double to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003edouble\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsDouble(double)",
      "begin_line": 268,
      "end_line": 272,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003edouble\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumDouble()} and \n     * {@link #getMaximumDouble()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the double to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003edouble\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 72)",
        "(line 270,col 9)-(line 270,col 72)",
        "(line 271,col 9)-(line 271,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsFloat(java.lang.Number)",
      "begin_line": 286,
      "end_line": 291,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003eNumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation forwards to the {@link #containsFloat(float)} method.\u003c/p\u003e\n     *\n     * @param value  the float to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003efloat\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsFloat(float)",
      "begin_line": 304,
      "end_line": 308,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003efloat\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003efloat\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumFloat()} and \n     * {@link #getMaximumFloat()} methods and should be good for most uses.\u003c/p\u003e\n     * \n     * @param value  the float to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range by \u003ccode\u003efloat\u003c/code\u003e comparison\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 71)",
        "(line 306,col 9)-(line 306,col 71)",
        "(line 307,col 9)-(line 307,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.containsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 330,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe exact comparison implementation varies by subclass. It is\n     * intended that an \u003ccode\u003eint\u003c/code\u003e specific subclass will compare using\n     * \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #containsNumber(Number)} method.\n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within\n     *  this range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 335,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.overlapsRange(org.apache.commons.lang.math.Range)",
      "begin_line": 356,
      "end_line": 363,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe exact comparison implementation varies by subclass. It is\n     * intended that an \u003ccode\u003eint\u003c/code\u003e specific subclass will compare using\n     * \u003ccode\u003eint\u003c/code\u003e comparison.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #containsNumber(Number)} and\n     * {@link #containsRange(Range)} methods.\n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.equals(java.lang.Object)",
      "begin_line": 380,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} and \n     * {@link #getMaximumNumber()} methods. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.hashCode()",
      "begin_line": 401,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} and \n     * {@link #getMaximumNumber()} methods. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 24)",
        "(line 403,col 9)-(line 403,col 53)",
        "(line 404,col 9)-(line 404,col 61)",
        "(line 405,col 9)-(line 405,col 61)",
        "(line 406,col 9)-(line 406,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Range.toString()",
      "begin_line": 420,
      "end_line": 428,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis implementation uses the {@link #getMinimumNumber()} and \n     * {@link #getMaximumNumber()} methods. \n     * Subclasses may be able to optimise this.\u003c/p\u003e\n     *\n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 48)",
        "(line 422,col 9)-(line 422,col 29)",
        "(line 423,col 9)-(line 423,col 39)",
        "(line 424,col 9)-(line 424,col 24)",
        "(line 425,col 9)-(line 425,col 39)",
        "(line 426,col 9)-(line 426,col 24)",
        "(line 427,col 9)-(line 427,col 30)"
      ]
    }
  ]
}