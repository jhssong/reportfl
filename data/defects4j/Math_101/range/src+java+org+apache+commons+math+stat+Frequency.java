{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 460,
      "comment": " \n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Object values.  New values added must be \n * comparable to those that have been added, otherwise the add method will \n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type -- \n * i.e. \u003ccode\u003eaddValue(new Long(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a  \n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency(java.util.Comparator)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     * \n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.toString()",
      "begin_line": 71,
      "end_line": 88,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     * \n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 60)",
        "(line 73,col 9)-(line 73,col 52)",
        "(line 74,col 9)-(line 74,col 66)",
        "(line 75,col 9)-(line 75,col 54)",
        "(line 76,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Object)",
      "begin_line": 96,
      "end_line": 112,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(int)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Integer)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(long)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(char)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.clear()",
      "begin_line": 151,
      "end_line": 153,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.valuesIterator()",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are itegral (i.e., integers, longs, Integers, or Longs), \n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     * \n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getSumFreq()",
      "begin_line": 175,
      "end_line": 182,
      "comment": "\n     * Returns the sum of all frequencies.\n     * \n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 24)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(java.lang.Object)",
      "begin_line": 190,
      "end_line": 204,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 24)",
        "(line 195,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(int)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(long)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(char)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(java.lang.Object)",
      "begin_line": 247,
      "end_line": 252,
      "comment": "\n      * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(long)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(char)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(java.lang.Object)",
      "begin_line": 297,
      "end_line": 337,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 46)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 24)",
        "(line 310,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 43)",
        "(line 328,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(int)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(long)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(char)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(java.lang.Object)",
      "begin_line": 388,
      "end_line": 393,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(int)",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(long)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(char)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NaturalComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator",
        "java.io.Serializable"
      ],
      "begin_line": 438,
      "end_line": 459,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 441,
      "end_line": 441,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.NaturalComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         * \n         * @param  o1 the first object \n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable}, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 457,col 13)-(line 457,col 50)"
      ]
    }
  ]
}