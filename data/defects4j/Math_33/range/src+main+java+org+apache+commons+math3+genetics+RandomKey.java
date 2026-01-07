{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/genetics/RandomKey.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomKey",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.AbstractListChromosome\u003cjava.lang.Double\u003e",
        "org.apache.commons.math3.genetics.PermutationChromosome\u003cT\u003e"
      ],
      "begin_line": 68,
      "end_line": 310,
      "comment": "\n * \u003cp\u003e\n * Random Key chromosome is used for permutation representation. It is a vector\n * of a fixed length of real numbers in [0,1] interval. The index of the i-th\n * smallest value in the vector represents an i-th member of the permutation.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * For example, the random key [0.2, 0.3, 0.8, 0.1] corresponds to the\n * permutation of indices (3,0,1,2). If the original (unpermuted) sequence would\n * be (a,b,c,d), this would mean the sequence (d,a,b,c).\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * With this representation, common operators like n-point crossover can be\n * used, because any such chromosome represents a valid permutation.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Since the chromosome (and thus its arrayRepresentation) is immutable, the\n * array representation is sorted only once in the constructor.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * For details, see:\n * \u003cul\u003e\n * \u003cli\u003eBean, J.C.: Genetic algorithms and random keys for sequencing and\n * optimization. ORSA Journal on Computing 6 (1994) 154-160\u003c/li\u003e\n * \u003cli\u003eRothlauf, F.: Representations for Genetic and Evolutionary Algorithms.\n * Volume 104 of Studies in Fuzziness and Soft Computing. Physica-Verlag,\n * Heidelberg (2002)\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e\n *            type of the permuted objects\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sortedRepresentation"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Cache of sorted representation (unmodifiable). "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeqPermutation"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Base sequence [0,1,...,n-1], permuted accorting to the representation (unmodifiable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.RandomKey.RandomKey(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 85,
      "end_line": 95,
      "comment": "\n     * Constructor.\n     *\n     * @param representation list of [0,1] values representing the permutation\n     * @throws InvalidRepresentationException iff the \u003ccode\u003erepresentation\u003c/code\u003e can not represent\n     *         a valid chromosome\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 30)",
        "(line 88,col 9)-(line 88,col 78)",
        "(line 89,col 9)-(line 89,col 37)",
        "(line 90,col 9)-(line 90,col 72)",
        "(line 92,col 9)-(line 94,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.RandomKey.RandomKey(java.lang.Double[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Constructor.\n     *\n     * @param representation array of [0,1] values representing the permutation\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.decode(java.util.List\u003cT\u003e)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.decodeGeneric(java.util.List\u003cS\u003e, java.util.List\u003cjava.lang.Double\u003e, java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 125,
      "end_line": 148,
      "comment": "\n     * Decodes a permutation represented by \u003ccode\u003erepresentation\u003c/code\u003e and\n     * returns a (generic) list with the permuted values.\n     *\n     * @param \u003cS\u003e generic type of the sequence values\n     * @param sequence the unpermuted sequence\n     * @param representation representation of the permutation ([0,1] vector)\n     * @param sortedRepr sorted \u003ccode\u003erepresentation\u003c/code\u003e\n     * @return list with the sequence values permuted according to the representation\n     * @throws DimensionMismatchException iff the length of the \u003ccode\u003esequence\u003c/code\u003e,\n     * \u003ccode\u003erepresentation\u003c/code\u003e or \u003ccode\u003esortedRepr\u003c/code\u003e lists are not equal\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 32)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 138,col 9)-(line 138,col 71)",
        "(line 141,col 9)-(line 141,col 43)",
        "(line 142,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.isSame(org.apache.commons.math3.genetics.Chromosome)",
      "begin_line": 157,
      "end_line": 181,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ccode\u003eanother\u003c/code\u003e is a RandomKey and\n     * encodes the same permutation.\n     *\n     * @param another chromosome to compare\n     * @return true iff chromosomes encode the same permutation\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 56)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 171,col 9)-(line 171,col 57)",
        "(line 172,col 9)-(line 172,col 65)",
        "(line 174,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.checkValidity(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 186,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.randomPermutation(int)",
      "begin_line": 206,
      "end_line": 212,
      "comment": "\n     * Generates a representation corresponding to a random permutation of\n     * length l which can be passed to the RandomKey constructor.\n     *\n     * @param l length of the permutation\n     * @return representation of a random permutation\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 53)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.identityPermutation(int)",
      "begin_line": 221,
      "end_line": 227,
      "comment": "\n     * Generates a representation corresponding to an identity permutation of\n     * length l which can be passed to the RandomKey constructor.\n     *\n     * @param l length of the permutation\n     * @return representation of an identity permutation\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 53)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.comparatorPermutation(java.util.List\u003cS\u003e, java.util.Comparator\u003cS\u003e)",
      "begin_line": 242,
      "end_line": 248,
      "comment": "\n     * Generates a representation of a permutation corresponding to the\n     * \u003ccode\u003edata\u003c/code\u003e sorted by \u003ccode\u003ecomparator\u003c/code\u003e. The\n     * \u003ccode\u003edata\u003c/code\u003e is not modified during the process.\n     *\n     * This is useful if you want to inject some permutations to the initial\n     * population.\n     *\n     * @param \u003cS\u003e type of the data\n     * @param data list of data determining the order\n     * @param comparator how the data will be compared\n     * @return list representation of the permutation corresponding to the parameters\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 53)",
        "(line 245,col 9)-(line 245,col 49)",
        "(line 247,col 9)-(line 247,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.inducedPermutation(java.util.List\u003cS\u003e, java.util.List\u003cS\u003e)",
      "begin_line": 267,
      "end_line": 287,
      "comment": "\n     * Generates a representation of a permutation corresponding to a\n     * permutation which yields \u003ccode\u003epermutedData\u003c/code\u003e when applied to\n     * \u003ccode\u003eoriginalData\u003c/code\u003e.\n     *\n     * This method can be viewed as an inverse to {@link #decode(List)}.\n     *\n     * @param \u003cS\u003e type of the data\n     * @param originalData the original, unpermuted data\n     * @param permutedData the data, somehow permuted\n     * @return representation of a permutation corresponding to the permutation\n     * \u003ccode\u003eoriginalData -\u003e permutedData\u003c/code\u003e\n     * @throws DimensionMismatchException iff the length of \u003ccode\u003eoriginalData\u003c/code\u003e\n     * and \u003ccode\u003epermutedData\u003c/code\u003e lists are not equal\n     * @throws MathIllegalArgumentException iff the \u003ccode\u003epermutedData\u003c/code\u003e and\n     * \u003ccode\u003eoriginalData\u003c/code\u003e lists contain different data\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 36)",
        "(line 275,col 9)-(line 275,col 63)",
        "(line 277,col 9)-(line 277,col 37)",
        "(line 278,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.toString()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.RandomKey.baseSequence(int)",
      "begin_line": 303,
      "end_line": 309,
      "comment": "\n     * Helper for constructor. Generates a list of natural numbers (0,1,...,l-1).\n     *\n     * @param l length of list to generate\n     * @return list of integers from 0 to l-1\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 64)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 308,col 28)"
      ]
    }
  ]
}