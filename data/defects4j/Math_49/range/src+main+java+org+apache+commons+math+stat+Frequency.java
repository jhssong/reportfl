{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 511,
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
      "signature": "org.apache.commons.math.stat.Frequency.Frequency()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency(java.util.Comparator\u003c?\u003e)",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     *\n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.toString()",
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
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 110,
      "end_line": 128,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     *\n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 30)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(long)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(char)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     *\n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.clear()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.valuesIterator()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs),\n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     *\n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getSumFreq()",
      "begin_line": 182,
      "end_line": 189,
      "comment": "\n     * Returns the sum of all frequencies.\n     *\n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 24)",
        "(line 184,col 9)-(line 184,col 64)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 198,
      "end_line": 212,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 24)",
        "(line 203,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(int)",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(long)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(char)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Returns the number of values \u003d v.\n     *\n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getUniqueCount()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns the number of values in the frequency table.\n     *\n     * @return the number of unique values that have been added to the frequency table.\n     * @see #valuesIterator()\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 263,
      "end_line": 269,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 42)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(int)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(long)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(char)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 314,
      "end_line": 355,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 322,col 89)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 24)",
        "(line 328,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 345,col 58)",
        "(line 346,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(int)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(long)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(char)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 406,
      "end_line": 412,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 42)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(int)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(long)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(char)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     *\n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 47)"
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
      "begin_line": 457,
      "end_line": 479,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.NaturalComparator.compare(java.lang.Comparable\u003cT\u003e, java.lang.Comparable\u003cT\u003e)",
      "begin_line": 475,
      "end_line": 478,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         *\n         * @param  o1 the first object\n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e,\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable},\n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 477,col 13)-(line 477,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.hashCode()",
      "begin_line": 482,
      "end_line": 489,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 29)",
        "(line 485,col 9)-(line 485,col 23)",
        "(line 486,col 9)-(line 487,col 66)",
        "(line 488,col 9)-(line 488,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 492,
      "end_line": 509,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 42)",
        "(line 501,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 20)"
      ]
    }
  ]
}