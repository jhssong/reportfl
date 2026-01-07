{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 594,
      "comment": "\n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Comparable values.  New values added must be\n * comparable to those that have been added, otherwise the add method will\n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type --\n * i.e. \u003ccode\u003eaddValue(Long.valueOf(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * char values are converted by \u003ccode\u003eaddValue\u003c/code\u003e to Character instances.\n * As such, these values are not comparable to integral values, so attempts\n * to combine integral types with chars in a frequency distribution will fail.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a\n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency(java.util.Comparator\u003c?\u003e)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     *\n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.toString()",
      "begin_line": 84,
      "end_line": 102,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     *\n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 60)",
        "(line 87,col 9)-(line 87,col 54)",
        "(line 88,col 9)-(line 88,col 66)",
        "(line 89,col 9)-(line 89,col 69)",
        "(line 90,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.incrementValue(java.lang.Comparable\u003c?\u003e, long)",
      "begin_line": 130,
      "end_line": 148,
      "comment": "\n     * Increments the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @param increment the amount by which the value should be incremented\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 30)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(int)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Integer\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(long)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Long\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(char)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Char\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.clear()",
      "begin_line": 184,
      "end_line": 186,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.valuesIterator()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.entrySetIterator()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Return an Iterator over the set of keys and values that have been added.\n     * Using the entry set to iterate is more efficient in the case where you\n     * need to access respective counts as well as values, since it doesn\u0027t\n     * require a \"get\" for every key...the value is provided in the Map.Entry.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the values of the\n     * map entries returned by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return entry set Iterator\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getSumFreq()",
      "begin_line": 225,
      "end_line": 232,
      "comment": "\n     * Returns the sum of all frequencies.\n     *\n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 24)",
        "(line 227,col 9)-(line 227,col 64)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 241,
      "end_line": 255,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 24)",
        "(line 246,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(int)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(long)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(char)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getUniqueCount()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Returns the number of values in the frequency table.\n     *\n     * @return the number of unique values that have been added to the frequency table.\n     * @see #valuesIterator()\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 306,
      "end_line": 312,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 42)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(int)",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(long)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(char)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 357,
      "end_line": 398,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 365,col 89)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 369,col 24)",
        "(line 371,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 58)",
        "(line 389,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(int)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(long)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(char)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 449,
      "end_line": 455,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 42)",
        "(line 451,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(int)",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(long)",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(char)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(org.apache.commons.math3.stat.Frequency)",
      "begin_line": 507,
      "end_line": 515,
      "comment": "\n     * Merge another Frequency object\u0027s counts into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by other.\n     *\n     * @param other the other {@link Frequency} object to be merged\n     * @throws NullArgumentException if {@code other} is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 73)",
        "(line 510,col 9)-(line 510,col 87)",
        "(line 511,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(java.util.Collection\u003corg.apache.commons.math3.stat.Frequency\u003e)",
      "begin_line": 526,
      "end_line": 532,
      "comment": "\n     * Merge a {@link Collection} of {@link Frequency} objects into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by each of the others.\n     *\n     * @param others the other {@link Frequency} objects to be merged\n     * @throws NullArgumentException if the collection is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 74)",
        "(line 529,col 9)-(line 531,col 9)"
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
      "begin_line": 540,
      "end_line": 562,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 543,
      "end_line": 543,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.NaturalComparator.compare(java.lang.Comparable\u003cT\u003e, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 558,
      "end_line": 561,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         *\n         * @param  o1 the first object\n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable},\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 560,col 13)-(line 560,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.hashCode()",
      "begin_line": 565,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 29)",
        "(line 568,col 9)-(line 568,col 23)",
        "(line 569,col 9)-(line 570,col 66)",
        "(line 571,col 9)-(line 571,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 575,
      "end_line": 592,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 577,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 42)",
        "(line 584,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 20)"
      ]
    }
  ]
}