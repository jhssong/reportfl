{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/util/CombinatoricsUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CombinatoricsUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 637,
      "comment": "\n * Combinatorial utilities.\n *\n * @version $Id$\n * @since 3.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "FACTORIALS"
      ],
      "begin_line": 37,
      "end_line": 44,
      "comment": " All long-representable factorials "
    },
    {
      "type": "field",
      "varNames": [
        "STIRLING_S2"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Stirling numbers of the second kind. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.CombinatoricsUtils()",
      "begin_line": 50,
      "end_line": 52,
      "comment": " Private constructor. ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.binomialCoefficient(int, int)",
      "begin_line": 81,
      "end_line": 135,
      "comment": "\n     * Returns an exact representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which all coefficients are\n     * {@code  \u003c Long.MAX_VALUE} is 66. If the computed value exceeds\n     * {@code Long.MAX_VALUE} an {@code ArithMeticException} is\n     * thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 47)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 100,col 9)-(line 100,col 24)",
        "(line 101,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.binomialCoefficientDouble(int, int)",
      "begin_line": 162,
      "end_line": 184,
      "comment": "\n     * Returns a {@code double} representation of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code double}. The\n     * largest value of {@code n} for which all coefficients are \u003c\n     * Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,\n     * Double.POSITIVE_INFINITY is returned\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 47)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 27)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.binomialCoefficientLog(int, int)",
      "begin_line": 207,
      "end_line": 253,
      "comment": "\n     * Returns the natural {@code log} of the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/BinomialCoefficient.html\"\u003e Binomial\n     * Coefficient\u003c/a\u003e, \"{@code n choose k}\", the number of\n     * {@code k}-element subsets that can be selected from an\n     * {@code n}-element set.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param n the size of the set\n     * @param k the size of the subsets to be counted\n     * @return {@code n choose k}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if the result is too large to be\n     * represented by a long integer.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 240,col 9)-(line 240,col 26)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.factorial(int)",
      "begin_line": 279,
      "end_line": 288,
      "comment": "\n     * Returns n!. Shorthand for {@code n} \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e Factorial\u003c/a\u003e, the\n     * product of the numbers {@code 1,...,n}.\n     * \u003cp\u003e\n     * \u003cStrong\u003ePreconditions\u003c/strong\u003e:\n     * \u003cul\u003e\n     * \u003cli\u003e {@code n \u003e\u003d 0} (otherwise\n     * {@code IllegalArgumentException} is thrown)\u003c/li\u003e\n     * \u003cli\u003e The result is small enough to fit into a {@code long}. The\n     * largest value of {@code n} for which {@code n!} \u003c\n     * Long.MAX_VALUE} is 20. If the computed value exceeds {@code Long.MAX_VALUE}\n     * an {@code ArithMeticException } is thrown.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param n argument\n     * @return {@code n!}\n     * @throws MathArithmeticException if the result is too large to be represented\n     * by a {@code long}.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws MathArithmeticException if {@code n \u003e 20}: The factorial value is too\n     * large to fit in a {@code long}.\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.factorialDouble(int)",
      "begin_line": 303,
      "end_line": 312,
      "comment": "\n     * Compute n!, the\u003ca href\u003d\"http://mathworld.wolfram.com/Factorial.html\"\u003e\n     * factorial\u003c/a\u003e of {@code n} (the product of the numbers 1 to n), as a\n     * {@code double}.\n     * The result should be small enough to fit into a {@code double}: The\n     * largest {@code n} for which {@code n! \u003c Double.MAX_VALUE} is 170.\n     * If the computed value exceeds {@code Double.MAX_VALUE},\n     * {@code Double.POSITIVE_INFINITY} is returned.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.factorialLog(int)",
      "begin_line": 321,
      "end_line": 334,
      "comment": "\n     * Compute the natural logarithm of the factorial of {@code n}.\n     *\n     * @param n Argument.\n     * @return {@code n!}\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 26)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.stirlingS2(int, int)",
      "begin_line": 355,
      "end_line": 420,
      "comment": "\n     * Returns the \u003ca\n     * href\u003d\"http://mathworld.wolfram.com/StirlingNumberoftheSecondKind.html\"\u003e\n     * Stirling number of the second kind\u003c/a\u003e, \"{@code S(n,k)}\", the number of\n     * ways of partitioning an {@code n}-element set into {@code k} non-empty\n     * subsets.\n     * \u003cp\u003e\n     * The preconditions are {@code 0 \u003c\u003d k \u003c\u003d n } (otherwise\n     * {@code NotPositiveException} is thrown)\n     * \u003c/p\u003e\n     * @param n the size of the set\n     * @param k the number of non-empty subsets\n     * @return {@code S(n,k)}\n     * @throws NotPositiveException if {@code k \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     * @throws MathArithmeticException if some overflow happens, typically for n exceeding 25 and\n     * k between 20 and n-2 (S(n,n-1) is handled specifically and does not overflow)\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 48)",
        "(line 366,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 418,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.combinationsIterator(int, int)",
      "begin_line": 442,
      "end_line": 456,
      "comment": "\n     * Returns an Iterator whose range is the k-element subsets of {0, ..., n - 1}\n     * represented as {@code int[]} arrays.\n     * \u003cp\u003e\n     * The arrays returned by the iterator are sorted in descending order and\n     * they are visited in lexicographic order with significance from right to\n     * left. For example, combinationsIterator(4, 2) returns an Iterator that\n     * will generate the following sequence of arrays on successive calls to\n     * {@code next()}:\u003cbr/\u003e\n     * {@code [0, 1], [0, 2], [1, 2], [0, 3], [1, 3], [2, 3]}\n     * \u003c/p\u003e\n     * If {@code k \u003d\u003d 0} an Iterator containing an empty array is returned and\n     * if {@code k \u003d\u003d n} an Iterator containing [0, ..., n -1] is returned.\n     *\n     * @param n size of the set from which subsets are selected\n     * @param k size of the subsets to be enumerated\n     * @return an Iterator over the k-sets in n\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 28)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LexicographicCombinationIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cint[]\u003e"
      ],
      "begin_line": 471,
      "end_line": 582,
      "comment": "\n     * Lexicographic combinations iterator.\n     * \u003cp\u003e\n     * Implementation follows Algorithm T in \u003ci\u003eThe Art of Computer Programming\u003c/i\u003e\n     * Internet Draft (PRE-FASCICLE 3A), \"A Draft of Section 7.2.1.3 Generating All\n     * Combinations\u003c/a\u003e, D. Knuth, 2004.\u003c/p\u003e\n     * \u003cp\u003e\n     * The degenerate cases {@code k \u003d\u003d 0} and {@code k \u003d\u003d n} are NOT handled by this\n     * implementation.  If constructor arguments satisfy {@code k \u003d\u003d 0}\n     * or {@code k \u003e\u003d n}, no exception is generated, but the iterator is empty.\n     * \u003c/p\u003e\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 474,
      "end_line": 474,
      "comment": " Size of subsets returned by the iterator "
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": "\n         * c[1], ..., c[k] stores the next combination; c[k + 1], c[k + 2] are\n         * sentinels.\n         * \u003cp\u003e\n         * Note that c[0] is \"wasted\" but this makes it a little easier to\n         * follow the code.\n         * \u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "more"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": " Return value for {@link #hasNext()} "
    },
    {
      "type": "field",
      "varNames": [
        "j"
      ],
      "begin_line": 490,
      "end_line": 490,
      "comment": " Marker: smallest index such that c[j + 1] \u003e j "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.LexicographicCombinationIterator.LexicographicCombinationIterator(int, int)",
      "begin_line": 502,
      "end_line": 517,
      "comment": "\n         * Construct a CombinationIterator to enumerate k-sets from n.\n         * \u003cp\u003e\n         * NOTE: If {@code k \u003d\u003d\u003d 0} or {@code k \u003e\u003d n}, the Iterator will be empty\n         * (that is, {@link #hasNext()} will return {@code false} immediately.\n         * \u003c/p\u003e\n         *\n         * @param n size of the set from which subsets are enumerated\n         * @param k size of the subsets to enumerate\n         ",
      "child_ranges": [
        "(line 503,col 13)-(line 503,col 23)",
        "(line 504,col 13)-(line 504,col 31)",
        "(line 505,col 13)-(line 508,col 13)",
        "(line 510,col 13)-(line 512,col 13)",
        "(line 514,col 13)-(line 514,col 25)",
        "(line 515,col 13)-(line 515,col 25)",
        "(line 516,col 13)-(line 516,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.LexicographicCombinationIterator.hasNext()",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.LexicographicCombinationIterator.next()",
      "begin_line": 529,
      "end_line": 574,
      "comment": "\n         * {@inheritDoc}\n         ",
      "child_ranges": [
        "(line 530,col 13)-(line 532,col 13)",
        "(line 534,col 13)-(line 534,col 41)",
        "(line 535,col 13)-(line 535,col 46)",
        "(line 540,col 13)-(line 540,col 22)",
        "(line 541,col 13)-(line 546,col 13)",
        "(line 548,col 13)-(line 553,col 13)",
        "(line 555,col 13)-(line 555,col 37)",
        "(line 556,col 13)-(line 564,col 13)",
        "(line 566,col 13)-(line 569,col 13)",
        "(line 571,col 13)-(line 571,col 21)",
        "(line 572,col 13)-(line 572,col 16)",
        "(line 573,col 13)-(line 573,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.LexicographicCombinationIterator.remove()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n         * Not supported.\n         ",
      "child_ranges": [
        "(line 580,col 13)-(line 580,col 54)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SingletonIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cint[]\u003e"
      ],
      "begin_line": 588,
      "end_line": 617,
      "comment": "\n     * Iterator with just one element to handle degenerate cases (full array,\n     * empty array) for combination iterator.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "singleton"
      ],
      "begin_line": 590,
      "end_line": 590,
      "comment": " Singleton array "
    },
    {
      "type": "field",
      "varNames": [
        "more"
      ],
      "begin_line": 592,
      "end_line": 592,
      "comment": " True on initialization, false after first call to next "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.SingletonIterator.SingletonIterator(int[])",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n         * Create a singleton iterator providing the given array.\n         * @param singleton array returned by the iterator\n         ",
      "child_ranges": [
        "(line 598,col 13)-(line 598,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.SingletonIterator.hasNext()",
      "begin_line": 601,
      "end_line": 603,
      "comment": " @return True until next is called the first time, then false ",
      "child_ranges": [
        "(line 602,col 13)-(line 602,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.SingletonIterator.next()",
      "begin_line": 605,
      "end_line": 612,
      "comment": " @return the singleton in first activation; throws NSEE thereafter ",
      "child_ranges": [
        "(line 606,col 13)-(line 611,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.SingletonIterator.remove()",
      "begin_line": 614,
      "end_line": 616,
      "comment": " Not supported ",
      "child_ranges": [
        "(line 615,col 13)-(line 615,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.CombinatoricsUtils.checkBinomial(int, int)",
      "begin_line": 627,
      "end_line": 635,
      "comment": "\n     * Check binomial preconditions.\n     *\n     * @param n Size of the set.\n     * @param k Size of the subsets to be counted.\n     * @throws NotPositiveException if {@code n \u003c 0}.\n     * @throws NumberIsTooLargeException if {@code k \u003e n}.\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 634,col 9)"
      ]
    }
  ]
}