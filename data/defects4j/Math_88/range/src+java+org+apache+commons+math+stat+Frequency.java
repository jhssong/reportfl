{
  "filepath": "/tmp/Math-88b/src/java/org/apache/commons/math/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 48,
      "end_line": 529,
      "comment": " \n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Object values.  New values added must be \n * comparable to those that have been added, otherwise the add method will \n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type -- \n * i.e. \u003ccode\u003eaddValue(Long.valueOf(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * char values are converted by \u003ccode\u003eaddValue\u003c/code\u003e to Character instances.\n * As such, these values are not comparable to integral values, so attempts\n * to combine integral types with chars in a frequency distribution will fail.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a  \n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.stat.Frequency.Frequency(java.util.Comparator)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     * \n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.toString()",
      "begin_line": 78,
      "end_line": 96,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     * \n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 60)",
        "(line 81,col 9)-(line 81,col 52)",
        "(line 82,col 9)-(line 82,col 66)",
        "(line 83,col 9)-(line 83,col 57)",
        "(line 84,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Object)",
      "begin_line": 110,
      "end_line": 119,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     * \n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not Comparable, \n     *         or is not comparable with previous entries\n     * @deprecated use {@link #addValue(Comparable)} instead\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Comparable\u003c?\u003e)",
      "begin_line": 131,
      "end_line": 149,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     * \n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 30)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(int)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Integer)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(long)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(char)",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.clear()",
      "begin_line": 188,
      "end_line": 190,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.valuesIterator()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs), \n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     * \n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getSumFreq()",
      "begin_line": 212,
      "end_line": 219,
      "comment": "\n     * Returns the sum of all frequencies.\n     * \n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 24)",
        "(line 214,col 9)-(line 214,col 61)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(java.lang.Object)",
      "begin_line": 228,
      "end_line": 242,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 24)",
        "(line 233,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(int)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(long)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(char)",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(java.lang.Object)",
      "begin_line": 285,
      "end_line": 291,
      "comment": "\n      * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 42)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(int)",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(long)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(char)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(java.lang.Object)",
      "begin_line": 336,
      "end_line": 376,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 46)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 24)",
        "(line 349,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 46)",
        "(line 367,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 375,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(int)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(long)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(char)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(java.lang.Object)",
      "begin_line": 427,
      "end_line": 433,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 42)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(int)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(long)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(char)",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 47)"
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
      "begin_line": 478,
      "end_line": 500,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 481,
      "end_line": 481,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.NaturalComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 496,
      "end_line": 499,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         * \n         * @param  o1 the first object \n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable}, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 498,col 13)-(line 498,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.hashCode()",
      "begin_line": 503,
      "end_line": 510,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 29)",
        "(line 506,col 9)-(line 506,col 23)",
        "(line 507,col 9)-(line 508,col 66)",
        "(line 509,col 9)-(line 509,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.equals(java.lang.Object)",
      "begin_line": 513,
      "end_line": 528,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 515,col 9)-(line 516,col 24)",
        "(line 517,col 9)-(line 518,col 25)",
        "(line 519,col 9)-(line 520,col 25)",
        "(line 521,col 9)-(line 521,col 42)",
        "(line 522,col 9)-(line 526,col 25)",
        "(line 527,col 9)-(line 527,col 20)"
      ]
    }
  ]
}