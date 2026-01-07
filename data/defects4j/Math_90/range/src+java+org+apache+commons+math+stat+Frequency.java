{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/stat/Frequency.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Frequency",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 487,
      "comment": " \n * Maintains a frequency distribution.\n * \u003cp\u003e\n * Accepts int, long, char or Object values.  New values added must be \n * comparable to those that have been added, otherwise the add method will \n * throw an IllegalArgumentException.\u003c/p\u003e\n * \u003cp\u003e\n * Integer values (int, long, Integer, Long) are not distinguished by type -- \n * i.e. \u003ccode\u003eaddValue(Long.valueOf(2)), addValue(2), addValue(2l)\u003c/code\u003e all have\n * the same effect (similarly for arguments to \u003ccode\u003egetCount,\u003c/code\u003e etc.).\u003c/p\u003e\n * \u003cp\u003e\n * char values are converted by \u003ccode\u003eaddValue\u003c/code\u003e to Character instances.\n * As such, these values are not comparable to integral values, so attempts\n * to combine integral types with chars in a frequency distribution will fail.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The values are ordered using the default (natural order), unless a  \n * \u003ccode\u003eComparator\u003c/code\u003e is supplied in the constructor.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "freqTable"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " underlying collection "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.Frequency.Frequency(java.util.Comparator)",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Constructor allowing values Comparator to be specified.\n     * \n     * @param comparator Comparator used to order values\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.toString()",
      "begin_line": 76,
      "end_line": 94,
      "comment": "\n     * Return a string representation of this frequency\n     * distribution.\n     * \n     * @return a string representation.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 60)",
        "(line 79,col 9)-(line 79,col 52)",
        "(line 80,col 9)-(line 80,col 66)",
        "(line 81,col 9)-(line 81,col 54)",
        "(line 82,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Object)",
      "begin_line": 108,
      "end_line": 136,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \u003cp\u003e\n     * If other objects have already been added to this Frequency, v must\n     * be comparable to those that have already been added.\n     * \u003c/p\u003e\n     * \n     * @param v the value to add.\n     * @throws IllegalArgumentException if \u003ccode\u003ev\u003c/code\u003e is not comparable with previous entries\n     * @throws ClassCastException if \u003ccode\u003ev\u003c/code\u003e is not Comparable\n     * @deprecated use {@link #addValue(Comparable)} instead\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 23)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(java.lang.Integer)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(long)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.addValue(char)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Adds 1 to the frequency count for v.\n     * \n     * @param v the value to add.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.clear()",
      "begin_line": 175,
      "end_line": 177,
      "comment": " Clears the frequency table ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.valuesIterator()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns an Iterator over the set of values that have been added.\n     * \u003cp\u003e\n     * If added values are integral (i.e., integers, longs, Integers, or Longs), \n     * they are converted to Longs when they are added, so the objects returned\n     * by the Iterator will in this case be Longs.\u003c/p\u003e\n     * \n     * @return values Iterator\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getSumFreq()",
      "begin_line": 199,
      "end_line": 206,
      "comment": "\n     * Returns the sum of all frequencies.\n     * \n     * @return the total frequency count.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 24)",
        "(line 201,col 9)-(line 201,col 58)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(java.lang.Object)",
      "begin_line": 215,
      "end_line": 229,
      "comment": "\n     * Returns the number of values \u003d v.\n     * Returns 0 if the value is not comparable.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 24)",
        "(line 220,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(int)",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(long)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCount(char)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Returns the number of values \u003d v.\n     * \n     * @param v the value to lookup.\n     * @return the frequency of v.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(java.lang.Object)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\n      * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(int)",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(long)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getPct(char)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns the percentage of values that are equal to v\n     * (as a proportion between 0 and 1).\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(java.lang.Object)",
      "begin_line": 323,
      "end_line": 363,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup.\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 46)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 24)",
        "(line 336,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 353,col 43)",
        "(line 354,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(int)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(long)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumFreq(char)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * Returns the cumulative frequency of values less than or equal to v.\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values equal to v\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(java.lang.Object)",
      "begin_line": 414,
      "end_line": 420,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added.\n     * Returns 0 if at least one value has been added, but v is not comparable\n     * to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 42)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(int)",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(long)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.getCumPct(char)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Returns the cumulative percentage of values less than or equal to v\n     * (as a proportion between 0 and 1).\n     * \u003cp\u003e\n     * Returns 0 if v is not comparable to the values set.\u003c/p\u003e\n     * \n     * @param v the value to lookup\n     * @return the proportion of values less than or equal to v\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 47)"
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
      "begin_line": 465,
      "end_line": 486,
      "comment": "\n     * A Comparator that compares comparable objects using the\n     * natural order.  Copied from Commons Collections ComparableComparator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": " Serializable version identifier "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.Frequency.NaturalComparator.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n         * Compare the two {@link Comparable Comparable} arguments.\n         * This method is equivalent to:\n         * \u003cpre\u003e(({@link Comparable Comparable})o1).{@link Comparable#compareTo compareTo}(o2)\u003c/pre\u003e\n         * \n         * @param  o1 the first object \n         * @param  o2 the second object\n         * @return  result of comparison\n         * @throws NullPointerException when \u003ci\u003eo1\u003c/i\u003e is \u003ccode\u003enull\u003c/code\u003e, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         * @throws ClassCastException when \u003ci\u003eo1\u003c/i\u003e is not a {@link Comparable Comparable}, \n         *         or when \u003ccode\u003e((Comparable)o1).compareTo(o2)\u003c/code\u003e does\n         ",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 50)"
      ]
    }
  ]
}