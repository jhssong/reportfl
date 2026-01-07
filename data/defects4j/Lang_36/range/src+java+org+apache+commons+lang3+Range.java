{
  "filepath": "/tmp/Lang-36b/src/java/org/apache/commons/lang3/Range.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Range",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 367,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eRange\u003c/code\u003e represents a range of numbers of the same type.\u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @since 3.0\n * @version $Id: Range.java 830032 2009-10-27 00:15:00Z scolebourne $\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comparator"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if the value is not Comparable\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the natural ordering of the elements to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ClassCastException if either value is not Comparable\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.is(T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e using the specified\n     * element as both the minimum and maximum in this range.\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * @param element  the value to use for this range, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param c comparator to be used\n     * @throws IllegalArgumentException if the value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.between(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eRange\u003c/code\u003e with the specified\n     * minimum and maximum values (both inclusive).\u003c/p\u003e\n     * \u003cp\u003eThe range uses the passed in \u003ccode\u003eComparator\u003c/code\u003e to \n     * determine where values lie in the range.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe arguments may be passed in the order (min,max) or (max,min). The\n     * getMinimum and getMaximum methods will return the correct values.\u003c/p\u003e\n     *\n     * @param element1  first value that defines the edge of the range, inclusive\n     * @param element2  second value that defines the edge of the range, inclusive\n     * @param c comparator to be used\n     * @throws IllegalArgumentException if either value is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.Range(T, T, java.util.Comparator\u003cT\u003e)",
      "begin_line": 101,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 111,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMinimum()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * \u003cp\u003eGets the minimum value in this range.\u003c/p\u003e\n     *\n     * @return the minimum value in this range\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getMaximum()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eGets the maximum value in this range.\u003c/p\u003e\n     *\n     * @return the maximum value in this range\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.getComparator()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eGets the comparator being used to determine if objects are within the range. \u003c/p\u003e\n     *\n     * @return the comparator being used\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.isDefaultNaturalOrdering()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * \u003cp\u003eWhether or not the Range is using the default natural comparison method \n     * to compare elements. \u003c/p\u003e\n     *\n     * @return whether or not the default Comparator is in use\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.contains(T)",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs within this range\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementBefore(T)",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs before this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs before this range\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementAfter(T)",
      "begin_line": 203,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eTests whether the specified element occurs after this range.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param element  the element to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified element occurs after this range\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.elementCompareTo(T)",
      "begin_line": 220,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eTests where the specified element occurs relative to this range.\u003c/p\u003e\n     * \u003cp\u003eThe API is reminiscent of the Comparable interface returning \u003ccode\u003e-1\u003c/code\u003e if \n     * the element is before the range, \u003ccode\u003e0\u003c/code\u003e if contained within the range and \n     * \u003ccode\u003e1\u003c/code\u003e if the element is after the range. \u003c/p\u003e\n     *\n     * @param element  the element to test\n     * @return -1, 0 or +1 depending on the element\u0027s location relative to the range\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.containsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * \u003cp\u003eTests whether the specified range occurs entirely within this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range occurs entirely within\n     *  this range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 253,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.overlapsRange(org.apache.commons.lang3.Range\u003cT\u003e)",
      "begin_line": 266,
      "end_line": 273,
      "comment": "\n     * \u003cp\u003eTests whether the specified range overlaps with this range.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e is handled and returns \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param range  the range to test, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the specified range overlaps with this\n     *  range; otherwise, \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if the \u003ccode\u003eRange\u003c/code\u003e cannot be compared\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 272,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.equals(java.lang.Object)",
      "begin_line": 286,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eCompares this range to another object to test if they are equal.\u003c/p\u003e.\n     * \n     * \u003cp\u003eTo be equal, the class, minimum and maximum must be equal.\u003c/p\u003e\n     * \n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.hashCode()",
      "begin_line": 305,
      "end_line": 312,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the range.\u003c/p\u003e\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 24)",
        "(line 308,col 9)-(line 308,col 53)",
        "(line 309,col 9)-(line 309,col 55)",
        "(line 310,col 9)-(line 310,col 55)",
        "(line 311,col 9)-(line 311,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.toString()",
      "begin_line": 321,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eGets the range as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format of the String is \u0027Range[\u003ci\u003emin\u003c/i\u003e,\u003ci\u003emax\u003c/i\u003e]\u0027.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eString\u003c/code\u003e representation of this range\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 50)",
        "(line 324,col 9)-(line 324,col 29)",
        "(line 325,col 9)-(line 325,col 33)",
        "(line 326,col 9)-(line 326,col 24)",
        "(line 327,col 9)-(line 327,col 33)",
        "(line 328,col 9)-(line 328,col 24)",
        "(line 329,col 9)-(line 329,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ComparableComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 334,
      "end_line": 365,
      "comment": " Taken from Commons Collections - documentation removed as not a public class"
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 338,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.getInstance()",
      "begin_line": 341,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 13)-(line 343,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.ComparableComparator()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 347,col 13)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.compare(E, E)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.hashCode()",
      "begin_line": 354,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.Range.ComparableComparator.equals(java.lang.Object)",
      "begin_line": 359,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 361,col 13)-(line 362,col 85)"
      ]
    }
  ]
}