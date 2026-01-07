{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 455,
      "comment": " \n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Object values.  New values added must be \n * comparable to those that have been added, otherwise the add method will \n * throw an IllegalArgumentException.  \n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type -- \n * i.e. \u003ccode\u003eaddValue(new Long(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a  \n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency(java.util.Comparator)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     * \n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.toString()",
      "begin_line": 70,
      "end_line": 87,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     * \n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 60)",
        "(line 72,col 9)-(line 72,col 52)",
        "(line 73,col 9)-(line 73,col 66)",
        "(line 74,col 9)-(line 74,col 54)",
        "(line 75,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Object)",
      "begin_line": 95,
      "end_line": 111,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Integer)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(long)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(char)",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.clear()",
      "begin_line": 150,
      "end_line": 152,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.valuesIterator()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are itegral (i.e., integers, longs, Integers, or Longs), \n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\n     * \n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getSumFreq()",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * Returns the sum of all frequencies.\n     * \n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 24)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(java.lang.Object)",
      "begin_line": 189,
      "end_line": 203,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 24)",
        "(line 194,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(int)",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(long)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(char)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(java.lang.Object)",
      "begin_line": 246,
      "end_line": 251,
      "comment": "\n      * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(int)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n      * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(long)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n      * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(char)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(java.lang.Object)",
      "begin_line": 296,
      "end_line": 336,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\n     * \n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 46)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 24)",
        "(line 309,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 43)",
        "(line 327,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(int)",
      "begin_line": 346,
      "end_line": 348,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(long)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(char)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(java.lang.Object)",
      "begin_line": 387,
      "end_line": 392,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(int)",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(long)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(char)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NaturalComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator"
      ],
      "begin_line": 437,
      "end_line": 454,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.NaturalComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         * \n         * @param  o1 the first object \n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable}, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 50)"
      ]
    }
  ]
}