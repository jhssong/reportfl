{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/NumberRange.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NumberRange",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 220,
      "comment": "\n * \u003cp\u003eRepresents a range of {@link Number} objects.\u003c/p\u003e\n * \n * \u003cp\u003eThis class uses \u003ccode\u003edouble\u003c/code\u003e comparisons. This means that it\n * is unsuitable for dealing with large \u003ccode\u003eLong\u003c/code\u003e, \u003ccode\u003eBigDecimal\u003c/code\u003e\n * or \u003ccode\u003eBigInteger\u003c/code\u003e numbers.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:chrise@esha.com\"\u003eChristopher Elkins\u003c/a\u003e\n * @author Stephen Colebourne\n * @since 1.0\n * @version $Revision$ $Date$\n * \n * @deprecated Use one of the Range classes in org.apache.commons.lang.math.\n *             Class will be removed in Commons Lang 3.0.\n * \n "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The minimum number in this range. "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The maximum number in this range. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NumberRange.NumberRange(java.lang.Number)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eNumberRange\u003c/code\u003e using\n     * \u003ccode\u003enumber\u003c/code\u003e as both the minimum and maximum in\n     * this range.\u003c/p\u003e\n     *\n     * @param num the number to use for this range\n     * @throws NullPointerException if the number is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 55,col 9)",
        "(line 57,col 9)-(line 57,col 23)",
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.NumberRange.NumberRange(java.lang.Number, java.lang.Number)",
      "begin_line": 73,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eNumberRange\u003c/code\u003e with the specified\n     * minimum and maximum numbers.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003cem\u003eIf the maximum is less than the minimum, the range will be constructed\n     * from the minimum value to the minimum value, not what you would expect!.\u003c/em\u003e\u003c/p\u003e\n     *\n     * @param min the minimum number in this range\n     * @param max the maximum number in this range\n     * @throws NullPointerException if either the minimum or maximum number is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.getMinimum()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * \u003cp\u003eReturns the minimum number in this range.\u003c/p\u003e\n     *\n     * @return the minimum number in this range\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.getMaximum()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eReturns the maximum number in this range.\u003c/p\u003e\n     *\n     * @return the maximum number in this range\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.includesNumber(java.lang.Number)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eTests whether the specified \u003ccode\u003enumber\u003c/code\u003e occurs within\n     * this range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     *\n     * @param number the number to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified number occurs within this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.includesRange(org.apache.commons.lang.NumberRange)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this\n     * range using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     *\n     * @param range the range to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within\n     *  this range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.overlaps(org.apache.commons.lang.NumberRange)",
      "begin_line": 147,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range\n     * using \u003ccode\u003edouble\u003c/code\u003e comparison.\u003c/p\u003e\n     *\n     * @param range the range to test\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.equals(java.lang.Object)",
      "begin_line": 164,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003eIndicates whether some other \u003ccode\u003eObject\u003c/code\u003e is\n     * \u0026quot;equal\u0026quot; to this one.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is the same as the obj\n     *  argument; \u003ccode\u003efalse\u003c/code\u003e otherwise\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.hashCode()",
      "begin_line": 180,
      "end_line": 185,
      "comment": "\n     * \u003cp\u003eReturns a hash code value for this object.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 24)",
        "(line 182,col 9)-(line 182,col 46)",
        "(line 183,col 9)-(line 183,col 46)",
        "(line 184,col 9)-(line 184,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.NumberRange.toString()",
      "begin_line": 196,
      "end_line": 218,
      "comment": "\n     * \u003cp\u003eReturns the string representation of this range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis string is the string representation of the minimum and\n     * maximum numbers in the range, separated by a hyphen. If a number\n     * is negative, then it is enclosed in parentheses.\u003c/p\u003e\n     *\n     * @return the string representation of this range\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 45)",
        "(line 199,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 23)",
        "(line 209,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 29)"
      ]
    }
  ]
}