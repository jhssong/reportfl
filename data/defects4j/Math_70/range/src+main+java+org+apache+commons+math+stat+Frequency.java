{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 592,
      "comment": "\n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Comparable values.  New values added must be\n * comparable to those that have been added, otherwise the add method will\n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type --\n * i.e. \u003ccode\u003eaddValue(Long.valueOf(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * char values are converted by \u003ccode\u003eaddValue\u003c/code\u003e to Character instances.\n * As such, these values are not comparable to integral values, so attempts\n * to combine integral types with chars in a frequency distribution will fail.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a\n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency(java.util.Comparator\u003c?\u003e)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     *\n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.toString()",
      "begin_line": 79,
      "end_line": 97,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     *\n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 60)",
        "(line 82,col 9)-(line 82,col 52)",
        "(line 83,col 9)-(line 83,col 66)",
        "(line 84,col 9)-(line 84,col 69)",
        "(line 85,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Object)",
      "begin_line": 111,
      "end_line": 120,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not Comparable,\n     *         or is not comparable with previous entries\n     * @deprecated use {@link #addValue(Comparable)} instead\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 132,
      "end_line": 150,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 30)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(int)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Integer)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @deprecated to be removed in math 3.0\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(long)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(char)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.clear()",
      "begin_line": 191,
      "end_line": 193,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.valuesIterator()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getSumFreq()",
      "begin_line": 215,
      "end_line": 222,
      "comment": "\n     * Returns the sum of all frequencies.\n     *\n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 24)",
        "(line 217,col 9)-(line 217,col 64)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(java.lang.Object)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     * @deprecated replaced by {@link #getCount(Comparable)} as of 2.0\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 244,
      "end_line": 258,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 24)",
        "(line 249,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(int)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(long)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(char)",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(java.lang.Object)",
      "begin_line": 302,
      "end_line": 305,
      "comment": "\n      * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     * @deprecated replaced by {@link #getPct(Comparable)} as of 2.0\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 316,
      "end_line": 322,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 42)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(int)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(long)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(char)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(java.lang.Object)",
      "begin_line": 368,
      "end_line": 371,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     * @deprecated replaced by {@link #getCumFreq(Comparable)} as of 2.0\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 381,
      "end_line": 422,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 389,col 89)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 24)",
        "(line 395,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 58)",
        "(line 413,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(int)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(long)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(char)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(java.lang.Object)",
      "begin_line": 474,
      "end_line": 478,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     * @deprecated replaced by {@link #getCumPct(Comparable)} as of 2.0\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 491,
      "end_line": 497,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 42)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(int)",
      "begin_line": 508,
      "end_line": 510,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(long)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(char)",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 47)"
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
      "begin_line": 542,
      "end_line": 564,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 545,
      "end_line": 545,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.NaturalComparator.compare(java.lang.Comparable\u003cT\u003e, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 560,
      "end_line": 563,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         *\n         * @param  o1 the first object\n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable},\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.hashCode()",
      "begin_line": 567,
      "end_line": 574,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 29)",
        "(line 570,col 9)-(line 570,col 23)",
        "(line 571,col 9)-(line 572,col 66)",
        "(line 573,col 9)-(line 573,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 577,
      "end_line": 590,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 579,col 9)-(line 580,col 24)",
        "(line 581,col 9)-(line 582,col 25)",
        "(line 583,col 9)-(line 583,col 42)",
        "(line 584,col 9)-(line 588,col 25)",
        "(line 589,col 9)-(line 589,col 20)"
      ]
    }
  ]
}