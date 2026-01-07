{
  "filepath": "/tmp/Math-10b/src/main/java/org/apache/commons/math3/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 51,
      "end_line": 585,
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
      "begin_line": 128,
      "end_line": 146,
      "comment": "\n     * Increments the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @param increment the amount by which the value should be incremented\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Integer\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(long)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Long\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(char)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Char\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.clear()",
      "begin_line": 182,
      "end_line": 184,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.valuesIterator()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.entrySetIterator()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Return an Iterator over the set of keys and values that have been added.\n     * Using the entry set to iterate is more efficient in the case where you\n     * need to access respective counts as well as values, since it doesn\u0027t\n     * require a \"get\" for every key...the value is provided in the Map.Entry.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the values of the\n     * map entries returned by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return entry set Iterator\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getSumFreq()",
      "begin_line": 223,
      "end_line": 230,
      "comment": "\n     * Returns the sum of all frequencies.\n     *\n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 24)",
        "(line 225,col 9)-(line 225,col 64)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 239,
      "end_line": 253,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 24)",
        "(line 244,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(int)",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(long)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(char)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getUniqueCount()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Returns the number of values in the frequency table.\n     *\n     * @return the number of unique values that have been added to the frequency table.\n     * @see #valuesIterator()\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 304,
      "end_line": 310,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 42)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(int)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(long)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(char)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 355,
      "end_line": 396,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 89)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 24)",
        "(line 369,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 58)",
        "(line 387,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(int)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(long)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(char)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 42)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(int)",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(long)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(char)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(org.apache.commons.math3.stat.Frequency)",
      "begin_line": 504,
      "end_line": 509,
      "comment": "\n     * Merge another Frequency object\u0027s counts into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by other.\n     *\n     * @param other the other {@link Frequency} object to be merged\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(java.util.Collection\u003corg.apache.commons.math3.stat.Frequency\u003e)",
      "begin_line": 519,
      "end_line": 523,
      "comment": "\n     * Merge a {@link Collection} of {@link Frequency} objects into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by each of the others.\n     *\n     * @param others the other {@link Frequency} objects to be merged\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)"
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
      "begin_line": 531,
      "end_line": 553,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.NaturalComparator.compare(java.lang.Comparable\u003cT\u003e, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 549,
      "end_line": 552,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         *\n         * @param  o1 the first object\n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable},\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 551,col 13)-(line 551,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.hashCode()",
      "begin_line": 556,
      "end_line": 563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 29)",
        "(line 559,col 9)-(line 559,col 23)",
        "(line 560,col 9)-(line 561,col 66)",
        "(line 562,col 9)-(line 562,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 566,
      "end_line": 583,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 42)",
        "(line 575,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 20)"
      ]
    }
  ]
}