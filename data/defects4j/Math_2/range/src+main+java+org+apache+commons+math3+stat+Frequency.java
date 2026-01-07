{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 632,
      "comment": "\n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Comparable values.  New values added must be\n * comparable to those that have been added, otherwise the add method will\n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type --\n * i.e. \u003ccode\u003eaddValue(Long.valueOf(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * char values are converted by \u003ccode\u003eaddValue\u003c/code\u003e to Character instances.\n * As such, these values are not comparable to integral values, so attempts\n * to combine integral types with chars in a frequency distribution will fail.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Float is not coerced to Double.\n * Since they are not Comparable with each other the user must do any necessary coercion.\n * Float.NaN and Double.NaN are not treated specially; they may occur in input and will\n * occur in output if appropriate.\n * \u003c/b\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a\n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.Frequency.Frequency(java.util.Comparator\u003c?\u003e)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     *\n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.toString()",
      "begin_line": 93,
      "end_line": 111,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     *\n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 60)",
        "(line 96,col 9)-(line 96,col 54)",
        "(line 97,col 9)-(line 97,col 66)",
        "(line 98,col 9)-(line 98,col 69)",
        "(line 99,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.incrementValue(java.lang.Comparable\u003c?\u003e, long)",
      "begin_line": 139,
      "end_line": 157,
      "comment": "\n     * Increments the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @param increment the amount by which the value should be incremented\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 30)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(int)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Integer\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(long)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Long\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.addValue(char)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     * @throws MathIllegalArgumentException if the table contains entries not\n     * comparable to Char\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.clear()",
      "begin_line": 193,
      "end_line": 195,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.valuesIterator()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.entrySetIterator()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Return an Iterator over the set of keys and values that have been added.\n     * Using the entry set to iterate is more efficient in the case where you\n     * need to access respective counts as well as values, since it doesn\u0027t\n     * require a \"get\" for every key...the value is provided in the Map.Entry.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the values of the\n     * map entries returned by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return entry set Iterator\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getSumFreq()",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\n     * Returns the sum of all frequencies.\n     *\n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 24)",
        "(line 236,col 9)-(line 236,col 64)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 250,
      "end_line": 264,
      "comment": "\n     * Returns the number of values equal to v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 24)",
        "(line 255,col 9)-(line 262,col 9)",
        "(line 263,col 9)-(line 263,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(int)",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns the number of values equal to v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(long)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Returns the number of values equal to v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCount(char)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Returns the number of values equal to v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getUniqueCount()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Returns the number of values in the frequency table.\n     *\n     * @return the number of unique values that have been added to the frequency table.\n     * @see #valuesIterator()\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 317,
      "end_line": 323,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 42)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(int)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(long)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getPct(char)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 368,
      "end_line": 409,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 89)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 24)",
        "(line 382,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 399,col 58)",
        "(line 400,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(int)",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(long)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumFreq(char)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 460,
      "end_line": 466,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 42)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(int)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(long)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getCumPct(char)",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.getMode()",
      "begin_line": 513,
      "end_line": 532,
      "comment": "\n     * Returns the mode value(s) in comparator order.\n     *\n     * @return a list containing the value(s) which appear most often.\n     * @since 3.3\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 29)",
        "(line 517,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 524,col 70)",
        "(line 525,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(org.apache.commons.math3.stat.Frequency)",
      "begin_line": 545,
      "end_line": 553,
      "comment": "\n     * Merge another Frequency object\u0027s counts into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by other.\n     *\n     * @param other the other {@link Frequency} object to be merged\n     * @throws NullArgumentException if {@code other} is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 73)",
        "(line 548,col 9)-(line 548,col 87)",
        "(line 549,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.merge(java.util.Collection\u003corg.apache.commons.math3.stat.Frequency\u003e)",
      "begin_line": 564,
      "end_line": 570,
      "comment": "\n     * Merge a {@link Collection} of {@link Frequency} objects into this instance.\n     * This Frequency\u0027s counts will be incremented (or set when not already set)\n     * by the counts represented by each of the others.\n     *\n     * @param others the other {@link Frequency} objects to be merged\n     * @throws NullArgumentException if the collection is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 74)",
        "(line 567,col 9)-(line 569,col 9)"
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
      "begin_line": 578,
      "end_line": 600,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 581,
      "end_line": 581,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.NaturalComparator.compare(java.lang.Comparable\u003cT\u003e, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 596,
      "end_line": 599,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         *\n         * @param  o1 the first object\n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable},\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.hashCode()",
      "begin_line": 603,
      "end_line": 610,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 29)",
        "(line 606,col 9)-(line 606,col 23)",
        "(line 607,col 9)-(line 608,col 66)",
        "(line 609,col 9)-(line 609,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 613,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 42)",
        "(line 622,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 20)"
      ]
    }
  ]
}