{
  "filepath": "/tmp/Math-16b/src/main/java/org/apache/commons/math3/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 581,
      "comment": "\n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Comparable values.  New values added must be\n * comparable to those that have been added, otherwise the add method will\n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type --\n * i.e. \u003ccode\u003eaddValue(Long.valueOf(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * char values are converted by \u003ccode\u003eaddValue\u003c/code\u003e to Character instances.\n * As such, these values are not comparable to integral values, so attempts\n * to combine integral types with chars in a frequency distribution will fail.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a\n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency(java.util.Comparator\u003c?\u003e)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     *\n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.toString()",
      "begin_line": 82,
      "end_line": 100,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     *\n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 60)",
        "(line 85,col 9)-(line 85,col 54)",
        "(line 86,col 9)-(line 86,col 66)",
        "(line 87,col 9)-(line 87,col 69)",
        "(line 88,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.incrementValue(java.lang.Comparable\u003c?\u003e, long)",
      "begin_line": 127,
      "end_line": 145,
      "comment": "\n     * Increments the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @param increment the amount by which the value should be incremented\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 30)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(int)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Integer\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(long)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Long\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(char)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Char\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.clear()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.valuesIterator()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.entrySetIterator()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Return an Iterator over the set of keys and values that have been added.\n     * Using the entry set to iterate is more efficient in the case where you\n     * need to access respective counts as well as values, since it doesn\u0027t\n     * require a \"get\" for every key...the value is provided in the Map.Entry.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the values of the\n     * map entries returned by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return entry set Iterator\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getSumFreq()",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\n     * Returns the sum of all frequencies.\n     *\n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 24)",
        "(line 223,col 9)-(line 223,col 64)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 237,
      "end_line": 251,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 24)",
        "(line 242,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(int)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(long)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(char)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getUniqueCount()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns the number of values in the frequency table.\n     *\n     * @return the number of unique values that have been added to the frequency table.\n     * @see #valuesIterator()\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 302,
      "end_line": 308,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 42)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(int)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(long)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(char)",
      "begin_line": 339,
      "end_line": 341,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 353,
      "end_line": 394,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 89)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 24)",
        "(line 367,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 58)",
        "(line 385,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(int)",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(long)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(char)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 445,
      "end_line": 451,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 42)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(int)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(long)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(char)",
      "begin_line": 488,
      "end_line": 490,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(org.apache.commons.math3.stat.Frequency)",
      "begin_line": 501,
      "end_line": 506,
      "comment": "\n     * Merge another Frequency object\u0027s counts into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by other.\n     *\n     * @param other the other {@link Frequency} object to be merged\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(java.util.Collection\u003corg.apache.commons.math3.stat.Frequency\u003e)",
      "begin_line": 515,
      "end_line": 519,
      "comment": "\n     * Merge a {@link Collection} of {@link Frequency} objects into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by each of the others.\n     *\n     * @param others the other {@link Frequency} objects to be merged\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 518,col 9)"
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
      "begin_line": 527,
      "end_line": 549,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 530,
      "end_line": 530,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.NaturalComparator.compare(java.lang.Comparable\u003cT\u003e, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 545,
      "end_line": 548,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         *\n         * @param  o1 the first object\n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable},\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 547,col 13)-(line 547,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.hashCode()",
      "begin_line": 552,
      "end_line": 559,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 29)",
        "(line 555,col 9)-(line 555,col 23)",
        "(line 556,col 9)-(line 557,col 66)",
        "(line 558,col 9)-(line 558,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 562,
      "end_line": 579,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 42)",
        "(line 571,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 20)"
      ]
    }
  ]
}