{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/ranking/NaturalRanking.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NaturalRanking",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.ranking.RankingAlgorithm"
      ],
      "begin_line": 70,
      "end_line": 463,
      "comment": "\n * \u003cp\u003e Ranking based on the natural ordering on doubles.\u003c/p\u003e\n * \u003cp\u003eNaNs are treated according to the configured {@link NaNStrategy} and ties\n * are handled using the selected {@link TiesStrategy}.\n * Configuration settings are supplied in optional constructor arguments.\n * Defaults are {@link NaNStrategy#MAXIMAL} and {@link TiesStrategy#AVERAGE},\n * respectively. When using {@link TiesStrategy#RANDOM}, a\n * {@link RandomGenerator} may be supplied as a constructor argument.\u003c/p\u003e\n * \u003cp\u003eExamples:\n * \u003ctable border\u003d\"1\" cellpadding\u003d\"3\"\u003e\n * \u003ctr\u003e\u003cth colspan\u003d\"3\"\u003e\n * Input data: (20, 17, 30, 42.3, 17, 50, Double.NaN, Double.NEGATIVE_INFINITY, 17)\n * \u003c/th\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003cth\u003eNaNStrategy\u003c/th\u003e\u003cth\u003eTiesStrategy\u003c/th\u003e\n * \u003cth\u003e\u003ccode\u003erank(data)\u003c/code\u003e\u003c/th\u003e\n * \u003ctr\u003e\n * \u003ctd\u003edefault (NaNs maximal)\u003c/td\u003e\n * \u003ctd\u003edefault (ties averaged)\u003c/td\u003e\n * \u003ctd\u003e(5, 3, 6, 7, 3, 8, 9, 1, 3)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003edefault (NaNs maximal)\u003c/td\u003e\n * \u003ctd\u003eMINIMUM\u003c/td\u003e\n * \u003ctd\u003e(5, 2, 6, 7, 2, 8, 9, 1, 2)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eMINIMAL\u003c/td\u003e\n * \u003ctd\u003edefault (ties averaged)\u003c/td\u003e\n * \u003ctd\u003e(6, 4, 7, 8, 4, 9, 1.5, 1.5, 4)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eREMOVED\u003c/td\u003e\n * \u003ctd\u003eSEQUENTIAL\u003c/td\u003e\n * \u003ctd\u003e(5, 2, 6, 7, 3, 8, 1, 4)\u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\n * \u003ctd\u003eMINIMAL\u003c/td\u003e\n * \u003ctd\u003eMAXIMUM\u003c/td\u003e\n * \u003ctd\u003e(6, 5, 7, 8, 5, 9, 2, 2, 5)\u003c/td\u003e\u003c/tr\u003e\u003c/table\u003e\u003c/p\u003e\n *\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_NAN_STRATEGY"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " default NaN strategy "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TIES_STRATEGY"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " default ties strategy "
    },
    {
      "type": "field",
      "varNames": [
        "nanStrategy"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " NaN strategy - defaults to NaNs maximal "
    },
    {
      "type": "field",
      "varNames": [
        "tiesStrategy"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Ties strategy - defaults to ties averaged "
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Source of random data - used only when ties strategy is RANDOM "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.NaturalRanking()",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\n     * Create a NaturalRanking with default strategies for handling ties and NaNs.\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 16)",
        "(line 92,col 9)-(line 92,col 45)",
        "(line 93,col 9)-(line 93,col 43)",
        "(line 94,col 9)-(line 94,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math.stat.ranking.TiesStrategy)",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\n     * Create a NaturalRanking with the given TiesStrategy.\n     *\n     * @param tiesStrategy the TiesStrategy to use\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 16)",
        "(line 104,col 9)-(line 104,col 41)",
        "(line 105,col 9)-(line 105,col 43)",
        "(line 106,col 9)-(line 106,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math.stat.ranking.NaNStrategy)",
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * Create a NaturalRanking with the given NaNStrategy.\n     *\n     * @param nanStrategy the NaNStrategy to use\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 116,col 9)-(line 116,col 39)",
        "(line 117,col 9)-(line 117,col 45)",
        "(line 118,col 9)-(line 118,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math.stat.ranking.NaNStrategy, org.apache.commons.math.stat.ranking.TiesStrategy)",
      "begin_line": 127,
      "end_line": 132,
      "comment": "\n     * Create a NaturalRanking with the given NaNStrategy and TiesStrategy.\n     *\n     * @param nanStrategy NaNStrategy to use\n     * @param tiesStrategy TiesStrategy to use\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 16)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 130,col 41)",
        "(line 131,col 9)-(line 131,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 140,
      "end_line": 145,
      "comment": "\n     * Create a NaturalRanking with TiesStrategy.RANDOM and the given\n     * RandomGenerator as the source of random data.\n     *\n     * @param randomGenerator source of random data\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 16)",
        "(line 142,col 9)-(line 142,col 48)",
        "(line 143,col 9)-(line 143,col 43)",
        "(line 144,col 9)-(line 144,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.NaturalRanking(org.apache.commons.math.stat.ranking.NaNStrategy, org.apache.commons.math.random.RandomGenerator)",
      "begin_line": 155,
      "end_line": 161,
      "comment": "\n     * Create a NaturalRanking with the given NaNStrategy, TiesStrategy.RANDOM\n     * and the given source of random data.\n     *\n     * @param nanStrategy NaNStrategy to use\n     * @param randomGenerator source of random data\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 16)",
        "(line 158,col 9)-(line 158,col 39)",
        "(line 159,col 9)-(line 159,col 48)",
        "(line 160,col 9)-(line 160,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.getNanStrategy()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Return the NaNStrategy\n     *\n     * @return returns the NaNStrategy\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.getTiesStrategy()",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Return the TiesStrategy\n     *\n     * @return the TiesStrategy\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.rank(double[])",
      "begin_line": 189,
      "end_line": 248,
      "comment": "\n     * Rank \u003ccode\u003edata\u003c/code\u003e using the natural ordering on Doubles, with\n     * NaN values handled according to \u003ccode\u003enanStrategy\u003c/code\u003e and ties\n     * resolved using \u003ccode\u003etiesStrategy.\u003c/code\u003e\n     *\n     * @param data array to be ranked\n     * @return array of ranks\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 63)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 198,col 9)-(line 198,col 42)",
        "(line 199,col 9)-(line 214,col 9)",
        "(line 217,col 9)-(line 217,col 27)",
        "(line 221,col 9)-(line 221,col 48)",
        "(line 222,col 9)-(line 222,col 20)",
        "(line 223,col 9)-(line 223,col 42)",
        "(line 224,col 9)-(line 224,col 59)",
        "(line 225,col 9)-(line 225,col 46)",
        "(line 226,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.removeNaNs(org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair[])",
      "begin_line": 257,
      "end_line": 279,
      "comment": "\n     * Returns an array that is a copy of the input array with IntDoublePairs\n     * having NaN values removed.\n     *\n     * @param ranks input array\n     * @return array with NaN-valued entries removed\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 67)",
        "(line 262,col 9)-(line 262,col 18)",
        "(line 263,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 59)",
        "(line 277,col 9)-(line 277,col 57)",
        "(line 278,col 9)-(line 278,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.recodeNaNs(org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair[], double)",
      "begin_line": 287,
      "end_line": 294,
      "comment": "\n     * Recodes NaN values to the given value.\n     *\n     * @param ranks array to recode\n     * @param value the value to replace NaNs with\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 293,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.containsNaNs(org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair[])",
      "begin_line": 302,
      "end_line": 309,
      "comment": "\n     * Checks for presence of NaNs in \u003ccode\u003eranks.\u003c/code\u003e\n     *\n     * @param ranks array to be searched for NaNs\n     * @return true iff ranks contains one or more NaNs\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.resolveTie(double[], java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 325,
      "end_line": 363,
      "comment": "\n     * Resolve a sequence of ties, using the configured {@link TiesStrategy}.\n     * The input \u003ccode\u003eranks\u003c/code\u003e array is expected to take the same value\n     * for all indices in \u003ccode\u003etiesTrace\u003c/code\u003e.  The common value is recoded\n     * according to the tiesStrategy. For example, if ranks \u003d \u003c5,8,2,6,2,7,1,2\u003e,\n     * tiesTrace \u003d \u003c2,4,7\u003e and tiesStrategy is MINIMUM, ranks will be unchanged.\n     * The same array and trace with tiesStrategy AVERAGE will come out\n     * \u003c5,8,3,6,3,7,1,3\u003e.\n     *\n     * @param ranks array of ranks\n     * @param tiesTrace list of indices where \u003ccode\u003eranks\u003c/code\u003e is constant\n     * -- that is, for any i and j in TiesTrace, \u003ccode\u003e ranks[i] \u003d\u003d ranks[j]\n     * \u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 49)",
        "(line 331,col 9)-(line 331,col 44)",
        "(line 333,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.fill(double[], java.util.List\u003cjava.lang.Integer\u003e, double)",
      "begin_line": 372,
      "end_line": 377,
      "comment": "\n     * Sets\u003ccode\u003edata[i] \u003d value\u003c/code\u003e for each i in \u003ccode\u003etiesTrace.\u003c/code\u003e\n     *\n     * @param data array to modify\n     * @param tiesTrace list of index values to set\n     * @param value value to set\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 58)",
        "(line 374,col 9)-(line 376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.restoreNaNs(double[], java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 385,
      "end_line": 394,
      "comment": "\n     * Set \u003ccode\u003eranks[i] \u003d Double.NaN\u003c/code\u003e for each i in \u003ccode\u003enanPositions.\u003c/code\u003e\n     *\n     * @param ranks array to modify\n     * @param nanPositions list of index values to set to \u003ccode\u003eDouble.NaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 61)",
        "(line 390,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.getNanPositions(org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair[])",
      "begin_line": 402,
      "end_line": 410,
      "comment": "\n     * Returns a list of indexes where \u003ccode\u003eranks\u003c/code\u003e is \u003ccode\u003eNaN.\u003c/code\u003e\n     *\n     * @param ranks array to search for \u003ccode\u003eNaNs\u003c/code\u003e\n     * @return list of indexes i such that \u003ccode\u003eranks[i] \u003d NaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 58)",
        "(line 404,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 19)"
      ]
    },
    {
      "type": "class_interface",
      "name": "IntDoublePair",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair\u003e"
      ],
      "begin_line": 418,
      "end_line": 462,
      "comment": "\n     * Represents the position of a double value in an ordering.\n     * Comparable interface is implemented so Arrays.sort can be used\n     * to sort an array of IntDoublePairs by value.  Note that the\n     * implicitly defined natural ordering is NOT consistent with equals.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 421,
      "end_line": 421,
      "comment": " Value of the pair "
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": " Original position of the pair "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair.IntDoublePair(double, int)",
      "begin_line": 431,
      "end_line": 434,
      "comment": "\n         * Construct an IntDoublePair with the given value and position.\n         * @param value the value of the pair\n         * @param position the original position\n         ",
      "child_ranges": [
        "(line 432,col 13)-(line 432,col 31)",
        "(line 433,col 13)-(line 433,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair.compareTo(org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n         * Compare this IntDoublePair to another pair.\n         * Only the \u003cstrong\u003evalues\u003c/strong\u003e are compared.\n         *\n         * @param other the other pair to compare this to\n         * @return result of \u003ccode\u003eDouble.compare(value, other.value)\u003c/code\u003e\n         ",
      "child_ranges": [
        "(line 444,col 13)-(line 444,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair.getValue()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n         * Returns the value of the pair.\n         * @return value\n         ",
      "child_ranges": [
        "(line 452,col 13)-(line 452,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.ranking.NaturalRanking.IntDoublePair.getPosition()",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n         * Returns the original position of the pair.\n         * @return position\n         ",
      "child_ranges": [
        "(line 460,col 13)-(line 460,col 28)"
      ]
    }
  ]
}