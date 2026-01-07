{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 517,
      "comment": "\n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Comparable values.  New values added must be\n * comparable to those that have been added, otherwise the add method will\n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type --\n * i.e. \u003ccode\u003eaddValue(Long.valueOf(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * char values are converted by \u003ccode\u003eaddValue\u003c/code\u003e to Character instances.\n * As such, these values are not comparable to integral values, so attempts\n * to combine integral types with chars in a frequency distribution will fail.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a\n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency(java.util.Comparator\u003c?\u003e)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     *\n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.toString()",
      "begin_line": 80,
      "end_line": 98,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     *\n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 54)",
        "(line 84,col 9)-(line 84,col 66)",
        "(line 85,col 9)-(line 85,col 69)",
        "(line 86,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 110,
      "end_line": 128,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(int)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Integer\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(long)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Long\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(char)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Char\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.clear()",
      "begin_line": 164,
      "end_line": 166,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.valuesIterator()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getSumFreq()",
      "begin_line": 188,
      "end_line": 195,
      "comment": "\n     * Returns the sum of all frequencies.\n     *\n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 24)",
        "(line 190,col 9)-(line 190,col 64)",
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 204,
      "end_line": 218,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 24)",
        "(line 209,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(long)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(char)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getUniqueCount()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns the number of values in the frequency table.\n     *\n     * @return the number of unique values that have been added to the frequency table.\n     * @see #valuesIterator()\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 269,
      "end_line": 275,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(int)",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(long)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(char)",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 320,
      "end_line": 361,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 89)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 24)",
        "(line 334,col 9)-(line 341,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 351,col 58)",
        "(line 352,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(int)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(long)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(char)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 412,
      "end_line": 418,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 42)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(int)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(long)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(char)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NaturalComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cjava.lang.Comparable\u003cT\u003e\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 463,
      "end_line": 485,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.NaturalComparator.compare(java.lang.Comparable\u003cT\u003e, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 481,
      "end_line": 484,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         *\n         * @param  o1 the first object\n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable},\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 483,col 13)-(line 483,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.hashCode()",
      "begin_line": 488,
      "end_line": 495,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 29)",
        "(line 491,col 9)-(line 491,col 23)",
        "(line 492,col 9)-(line 493,col 66)",
        "(line 494,col 9)-(line 494,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 498,
      "end_line": 515,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 42)",
        "(line 507,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 20)"
      ]
    }
  ]
}