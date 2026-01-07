{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/genetics/RandomKey.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomKey",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.AbstractListChromosome\u003cjava.lang.Double\u003e",
        "org.apache.commons.math.genetics.PermutationChromosome\u003cT\u003e"
      ],
      "begin_line": 64,
      "end_line": 290,
      "comment": "\n * \u003cp\u003e\n * Random Key chromosome is used for permutation representation. It is a vector\n * of a fixed length of real numbers in [0,1] interval. The index of the i-th\n * smallest value in the vector represents an i-th member of the permutation.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * For example, the random key [0.2, 0.3, 0.8, 0.1] corresponds to the\n * permutation of indices (3,0,1,2). If the original (unpermuted) sequence would\n * be (a,b,c,d), this would mean the sequence (d,a,b,c).\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * With this representation, common operators like n-point crossover can be\n * used, because any such chromosome represents a valid permutation.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Since the chromosome (and thus its arrayRepresentation) is immutable, the\n * array representation is sorted only once in the constructor.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * For details, see:\n * \u003cul\u003e\n * \u003cli\u003eBean, J.C.: Genetic algorithms and random keys for sequencing and\n * optimization. ORSA Journal on Computing 6 (1994) 154–160\u003c/li\u003e\n * \u003cli\u003eRothlauf, F.: Representations for Genetic and Evolutionary Algorithms.\n * Volume 104 of Studies in Fuzziness and Soft Computing. Physica-Verlag,\n * Heidelberg (2002)\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e\n *            type of the permuted objects\n * @since 2.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sortedRepresentation"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Cache of sorted representation (unmodifiable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeqPermutation"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Base sequence [0,1,...,n-1], permuted accorting to the representation (unmodifiable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.RandomKey.RandomKey(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 81,
      "end_line": 91,
      "comment": "\n     * Constructor.\n     *\n     * @param representation list of [0,1] values representing the permutation\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)",
        "(line 84,col 9)-(line 84,col 78)",
        "(line 85,col 9)-(line 85,col 37)",
        "(line 86,col 9)-(line 86,col 72)",
        "(line 88,col 9)-(line 90,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.RandomKey.RandomKey(java.lang.Double[])",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Constructor.\n     *\n     * @param representation array of [0,1] values representing the permutation\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.decode(java.util.List\u003cT\u003e)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.decodeGeneric(java.util.List\u003cS\u003e, java.util.List\u003cjava.lang.Double\u003e, java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 119,
      "end_line": 139,
      "comment": "\n     * Decodes a permutation represented by \u003ccode\u003erepresentation\u003c/code\u003e and\n     * returns a (generic) list with the permuted values.\n     *\n     * @param \u003cS\u003e generic type of the sequence values\n     * @param sequence the unpermuted sequence\n     * @param representation representation of the permutation ([0,1] vector)\n     * @param sortedRepr sorted \u003ccode\u003erepresentation\u003c/code\u003e\n     * @return list with the sequence values permuted according to the representation\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 32)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 71)",
        "(line 132,col 9)-(line 132,col 43)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.isSame(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 148,
      "end_line": 169,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ccode\u003eanother\u003c/code\u003e is a RandomKey and\n     * encodes the same permutation.\n     *\n     * @param another chromosome to compare\n     * @return true iff chromosomes encode the same permutation\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 152,col 25)",
        "(line 153,col 9)-(line 153,col 56)",
        "(line 155,col 9)-(line 156,col 25)",
        "(line 160,col 9)-(line 160,col 57)",
        "(line 161,col 9)-(line 161,col 65)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.checkValidity(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 174,
      "end_line": 181,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.randomPermutation(int)",
      "begin_line": 192,
      "end_line": 198,
      "comment": "\n     * Generates a representation corresponding to a random permutation of\n     * length l which can be passed to the RandomKey constructor.\n     *\n     * @param l\n     *            length of the permutation\n     * @return representation of a random permutation\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 53)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.identityPermutation(int)",
      "begin_line": 208,
      "end_line": 214,
      "comment": "\n     * Generates a representation corresponding to an identity permutation of\n     * length l which can be passed to the RandomKey constructor.\n     *\n     * @param l\n     *            length of the permutation\n     * @return representation of an identity permutation\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 53)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.comparatorPermutation(java.util.List\u003cS\u003e, java.util.Comparator\u003cS\u003e)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "\n     * Generates a representation of a permutation corresponding to the\n     * \u003ccode\u003edata\u003c/code\u003e sorted by \u003ccode\u003ecomparator\u003c/code\u003e. The\n     * \u003ccode\u003edata\u003c/code\u003e is not modified during the process.\n     *\n     * This is useful if you want to inject some permutations to the initial\n     * population.\n     *\n     * @param \u003cS\u003e type of the data\n     * @param data list of data determining the order\n     * @param comparator how the data will be compared\n     * @return list representation of the permutation corresponding to the parameters\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 53)",
        "(line 231,col 9)-(line 231,col 49)",
        "(line 233,col 9)-(line 233,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.inducedPermutation(java.util.List\u003cS\u003e, java.util.List\u003cS\u003e)",
      "begin_line": 249,
      "end_line": 267,
      "comment": "\n     * Generates a representation of a permutation corresponding to a\n     * permutation which yields \u003ccode\u003epermutedData\u003c/code\u003e when applied to\n     * \u003ccode\u003eoriginalData\u003c/code\u003e.\n     *\n     * This method can be viewed as an inverse to {@link #decode(List)}.\n     *\n     * @param \u003cS\u003e type of the data\n     * @param originalData the original, unpermuted data\n     * @param permutedData the data, somehow permuted\n     * @return representation of a permutation corresponding to the permutation \u003ccode\u003eoriginalData -\u003e permutedData\u003c/code\u003e\n     * @throws IllegalArgumentException iff the \u003ccode\u003epermutedData\u003c/code\u003e and \u003ccode\u003eoriginalData\u003c/code\u003e contains different data\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 36)",
        "(line 255,col 9)-(line 255,col 63)",
        "(line 257,col 9)-(line 257,col 37)",
        "(line 258,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.toString()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.baseSequence(int)",
      "begin_line": 283,
      "end_line": 289,
      "comment": "\n     * Helper for constructor. Generates a list of natural numbers (0,1,...,l-1).\n     *\n     * @param l length of list to generate\n     * @return list of integers from 0 to l-1\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 64)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 28)"
      ]
    }
  ]
}