{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/ranking/NaturalRanking.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NaturalRanking",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.ranking.RankingAlgorithm"
      ],
      "begin_line": 71,
      "end_line": 475,
      "comment": "\n * \u003cp\u003e Ranking based on the natural ordering on doubles.\u003c/p\u003e\n * \u003cp\u003eNaNs are treated according to the configured {@link NaNStrategy} and ties\n * are handled using the selected {@link TiesStrategy}.\n * Configuration settings are supplied in optional constructor arguments.\n * Defaults are {@link NaNStrategy#FAILED} and {@link TiesStrategy#AVERAGE},\n * respectively. When using {@link TiesStrategy#RANDOM}, a\n * {@link RandomGenerator} may be supplied as a constructor argument.\u003c/p\u003e\n * \u003cp\u003eExamples:\n * \u003ctable border\u003d\"1\" cellpadding\u003d\"3\"\u003e\n * \u003ctr\u003e\u003cth colspan\u003d\"3\"\u003e\n * Input data: (20, 17, 30, 42.3, 17, 50, Double.NaN, Double.NEGATIVE_INFINITY, 17)\n * \u003c/th\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003cth\u003eNaNStrategy\u003c/th\u003e\u003cth\u003eTiesStrategy\u003c/th\u003e\n * \u003cth\u003e\u003ccode\u003erank(data)\u003c/code\u003e\u003c/th\u003e\n * \u003ctr\u003e\n * \u003ctd\u003edefault (NaNs maximal)\u003c/td\u003e\n * \u003ctd\u003edefault (ties averaged)\u003c/td\u003e\n * \u003ctd\u003e(5, 3, 6, 7, 3, 8, 9, 1, 3)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003edefault (NaNs maximal)\u003c/td\u003e\n * \u003ctd\u003eMINIMUM\u003c/td\u003e\n * \u003ctd\u003e(5, 2, 6, 7, 2, 8, 9, 1, 2)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eMINIMAL\u003c/td\u003e\n * \u003ctd\u003edefault (ties averaged)\u003c/td\u003e\n * \u003ctd\u003e(6, 4, 7, 8, 4, 9, 1.5, 1.5, 4)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eREMOVED\u003c/td\u003e\n * \u003ctd\u003eSEQUENTIAL\u003c/td\u003e\n * \u003ctd\u003e(5, 2, 6, 7, 3, 8, 1, 4)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eMINIMAL\u003c/td\u003e\n * \u003ctd\u003eMAXIMUM\u003c/td\u003e\n * \u003ctd\u003e(6, 5, 7, 8, 5, 9, 2, 2, 5)\u003c/td\u003e\u003c/tr\u003e\u003c/table\u003e\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NAN_STRATEGY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " default NaN strategy "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIES_STRATEGY"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " default ties strategy "
    },
    {
      "type": "field",
      "varNames": [
        "nanStrategy"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " NaN strategy - defaults to NaNs maximal "
    },
    {
      "type": "field",
      "varNames": [
        "tiesStrategy"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Ties strategy - defaults to ties averaged "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Source of random data - used only when ties strategy is RANDOM "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.NaturalRanking()",
      "begin_line": 91,
      "end_line": 96,
      "comment": "\n     * Create a NaturalRanking with default strategies for handling ties and NaNs.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 16)",
        "(line 93,col 9)-(line 93,col 45)",
        "(line 94,col 9)-(line 94,col 43)",
        "(line 95,col 9)-(line 95,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math3.stat.ranking.TiesStrategy)",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n     * Create a NaturalRanking with the given TiesStrategy.\n     *\n     * @param tiesStrategy the TiesStrategy to use\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 16)",
        "(line 105,col 9)-(line 105,col 41)",
        "(line 106,col 9)-(line 106,col 43)",
        "(line 107,col 9)-(line 107,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math3.stat.ranking.NaNStrategy)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * Create a NaturalRanking with the given NaNStrategy.\n     *\n     * @param nanStrategy the NaNStrategy to use\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 16)",
        "(line 117,col 9)-(line 117,col 39)",
        "(line 118,col 9)-(line 118,col 45)",
        "(line 119,col 9)-(line 119,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math3.stat.ranking.NaNStrategy, org.apache.commons.math3.stat.ranking.TiesStrategy)",
      "begin_line": 128,
      "end_line": 133,
      "comment": "\n     * Create a NaturalRanking with the given NaNStrategy and TiesStrategy.\n     *\n     * @param nanStrategy NaNStrategy to use\n     * @param tiesStrategy TiesStrategy to use\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 16)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 131,col 41)",
        "(line 132,col 9)-(line 132,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\n     * Create a NaturalRanking with TiesStrategy.RANDOM and the given\n     * RandomGenerator as the source of random data.\n     *\n     * @param randomGenerator source of random data\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 16)",
        "(line 143,col 9)-(line 143,col 48)",
        "(line 144,col 9)-(line 144,col 43)",
        "(line 145,col 9)-(line 145,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math3.stat.ranking.NaNStrategy, org.apache.commons.math3.random.RandomGenerator)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Create a NaturalRanking with the given NaNStrategy, TiesStrategy.RANDOM\n     * and the given source of random data.\n     *\n     * @param nanStrategy NaNStrategy to use\n     * @param randomGenerator source of random data\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 16)",
        "(line 159,col 9)-(line 159,col 39)",
        "(line 160,col 9)-(line 160,col 48)",
        "(line 161,col 9)-(line 161,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.getNanStrategy()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Return the NaNStrategy\n     *\n     * @return returns the NaNStrategy\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.getTiesStrategy()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Return the TiesStrategy\n     *\n     * @return the TiesStrategy\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.rank(double[])",
      "begin_line": 192,
      "end_line": 257,
      "comment": "\n     * Rank \u003ccode\u003edata\u003c/code\u003e using the natural ordering on Doubles, with\n     * NaN values handled according to \u003ccode\u003enanStrategy\u003c/code\u003e and ties\n     * resolved using \u003ccode\u003etiesStrategy.\u003c/code\u003e\n     *\n     * @param data array to be ranked\n     * @return array of ranks\n     * @throws NotANumberException if the selected {@link NaNStrategy} is {@code FAILED}\n     * and a {@link Double#NaN} is encountered in the input data\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 63)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 201,col 9)-(line 201,col 42)",
        "(line 202,col 9)-(line 223,col 9)",
        "(line 226,col 9)-(line 226,col 27)",
        "(line 230,col 9)-(line 230,col 48)",
        "(line 231,col 9)-(line 231,col 20)",
        "(line 232,col 9)-(line 232,col 42)",
        "(line 233,col 9)-(line 233,col 59)",
        "(line 234,col 9)-(line 234,col 46)",
        "(line 235,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.removeNaNs(org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair[])",
      "begin_line": 266,
      "end_line": 288,
      "comment": "\n     * Returns an array that is a copy of the input array with IntDoublePairs\n     * having NaN values removed.\n     *\n     * @param ranks input array\n     * @return array with NaN-valued entries removed\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 270,col 67)",
        "(line 271,col 9)-(line 271,col 18)",
        "(line 272,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 59)",
        "(line 286,col 9)-(line 286,col 57)",
        "(line 287,col 9)-(line 287,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.recodeNaNs(org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair[], double)",
      "begin_line": 296,
      "end_line": 303,
      "comment": "\n     * Recodes NaN values to the given value.\n     *\n     * @param ranks array to recode\n     * @param value the value to replace NaNs with\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.containsNaNs(org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair[])",
      "begin_line": 311,
      "end_line": 318,
      "comment": "\n     * Checks for presence of NaNs in \u003ccode\u003eranks.\u003c/code\u003e\n     *\n     * @param ranks array to be searched for NaNs\n     * @return true iff ranks contains one or more NaNs\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.resolveTie(double[], java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 334,
      "end_line": 373,
      "comment": "\n     * Resolve a sequence of ties, using the configured {@link TiesStrategy}.\n     * The input \u003ccode\u003eranks\u003c/code\u003e array is expected to take the same value\n     * for all indices in \u003ccode\u003etiesTrace\u003c/code\u003e.  The common value is recoded\n     * according to the tiesStrategy. For example, if ranks \u003d \u003c5,8,2,6,2,7,1,2\u003e,\n     * tiesTrace \u003d \u003c2,4,7\u003e and tiesStrategy is MINIMUM, ranks will be unchanged.\n     * The same array and trace with tiesStrategy AVERAGE will come out\n     * \u003c5,8,3,6,3,7,1,3\u003e.\n     *\n     * @param ranks array of ranks\n     * @param tiesTrace list of indices where \u003ccode\u003eranks\u003c/code\u003e is constant\n     * -- that is, for any i and j in TiesTrace, \u003ccode\u003e ranks[i] \u003d\u003d ranks[j]\n     * \u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 49)",
        "(line 340,col 9)-(line 340,col 44)",
        "(line 342,col 9)-(line 372,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.fill(double[], java.util.List\u003cjava.lang.Integer\u003e, double)",
      "begin_line": 382,
      "end_line": 387,
      "comment": "\n     * Sets\u003ccode\u003edata[i] \u003d value\u003c/code\u003e for each i in \u003ccode\u003etiesTrace.\u003c/code\u003e\n     *\n     * @param data array to modify\n     * @param tiesTrace list of index values to set\n     * @param value value to set\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 58)",
        "(line 384,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.restoreNaNs(double[], java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 395,
      "end_line": 404,
      "comment": "\n     * Set \u003ccode\u003eranks[i] \u003d Double.NaN\u003c/code\u003e for each i in \u003ccode\u003enanPositions.\u003c/code\u003e\n     *\n     * @param ranks array to modify\n     * @param nanPositions list of index values to set to \u003ccode\u003eDouble.NaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 61)",
        "(line 400,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.getNanPositions(org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair[])",
      "begin_line": 412,
      "end_line": 420,
      "comment": "\n     * Returns a list of indexes where \u003ccode\u003eranks\u003c/code\u003e is \u003ccode\u003eNaN.\u003c/code\u003e\n     *\n     * @param ranks array to search for \u003ccode\u003eNaNs\u003c/code\u003e\n     * @return list of indexes i such that \u003ccode\u003eranks[i] \u003d NaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 58)",
        "(line 414,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IntDoublePair",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair\u003e"
      ],
      "begin_line": 428,
      "end_line": 474,
      "comment": "\n     * Represents the position of a double value in an ordering.\n     * Comparable interface is implemented so Arrays.sort can be used\n     * to sort an array of IntDoublePairs by value.  Note that the\n     * implicitly defined natural ordering is NOT consistent with equals.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": " Value of the pair "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": " Original position of the pair "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair.IntDoublePair(double, int)",
      "begin_line": 441,
      "end_line": 444,
      "comment": "\n         * Construct an IntDoublePair with the given value and position.\n         * @param value the value of the pair\n         * @param position the original position\n         ",
      "child_ranges": [
        "(line 442,col 13)-(line 442,col 31)",
        "(line 443,col 13)-(line 443,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair.compareTo(org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair)",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n         * Compare this IntDoublePair to another pair.\n         * Only the \u003cstrong\u003evalues\u003c/strong\u003e are compared.\n         *\n         * @param other the other pair to compare this to\n         * @return result of \u003ccode\u003eDouble.compare(value, other.value)\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 454,col 13)-(line 454,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair.getValue()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n         * Returns the value of the pair.\n         * @return value\n         ",
      "child_ranges": [
        "(line 464,col 13)-(line 464,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.ranking.NaturalRanking.IntDoublePair.getPosition()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n         * Returns the original position of the pair.\n         * @return position\n         ",
      "child_ranges": [
        "(line 472,col 13)-(line 472,col 28)"
      ]
    }
  ]
}