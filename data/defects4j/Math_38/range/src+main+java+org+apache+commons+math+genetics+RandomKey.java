{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/genetics/RandomKey.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomKey",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.AbstractListChromosome\u003cjava.lang.Double\u003e",
        "org.apache.commons.math.genetics.PermutationChromosome\u003cT\u003e"
      ],
      "begin_line": 65,
      "end_line": 295,
      "comment": "\n * \u003cp\u003e\n * Random Key chromosome is used for permutation representation. It is a vector\n * of a fixed length of real numbers in [0,1] interval. The index of the i-th\n * smallest value in the vector represents an i-th member of the permutation.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * For example, the random key [0.2, 0.3, 0.8, 0.1] corresponds to the\n * permutation of indices (3,0,1,2). If the original (unpermuted) sequence would\n * be (a,b,c,d), this would mean the sequence (d,a,b,c).\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * With this representation, common operators like n-point crossover can be\n * used, because any such chromosome represents a valid permutation.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * Since the chromosome (and thus its arrayRepresentation) is immutable, the\n * array representation is sorted only once in the constructor.\n * \u003c/p\u003e\n *\n * \u003cp\u003e\n * For details, see:\n * \u003cul\u003e\n * \u003cli\u003eBean, J.C.: Genetic algorithms and random keys for sequencing and\n * optimization. ORSA Journal on Computing 6 (1994) 154-160\u003c/li\u003e\n * \u003cli\u003eRothlauf, F.: Representations for Genetic and Evolutionary Algorithms.\n * Volume 104 of Studies in Fuzziness and Soft Computing. Physica-Verlag,\n * Heidelberg (2002)\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n *\n * @param \u003cT\u003e\n *            type of the permuted objects\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "sortedRepresentation"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Cache of sorted representation (unmodifiable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "baseSeqPermutation"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Base sequence [0,1,...,n-1], permuted accorting to the representation (unmodifiable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.RandomKey.RandomKey(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 82,
      "end_line": 92,
      "comment": "\n     * Constructor.\n     *\n     * @param representation list of [0,1] values representing the permutation\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 30)",
        "(line 85,col 9)-(line 85,col 78)",
        "(line 86,col 9)-(line 86,col 37)",
        "(line 87,col 9)-(line 87,col 72)",
        "(line 89,col 9)-(line 91,col 10)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.RandomKey.RandomKey(java.lang.Double[])",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Constructor.\n     *\n     * @param representation array of [0,1] values representing the permutation\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.decode(java.util.List\u003cT\u003e)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.decodeGeneric(java.util.List\u003cS\u003e, java.util.List\u003cjava.lang.Double\u003e, java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 120,
      "end_line": 140,
      "comment": "\n     * Decodes a permutation represented by \u003ccode\u003erepresentation\u003c/code\u003e and\n     * returns a (generic) list with the permuted values.\n     *\n     * @param \u003cS\u003e generic type of the sequence values\n     * @param sequence the unpermuted sequence\n     * @param representation representation of the permutation ([0,1] vector)\n     * @param sortedRepr sorted \u003ccode\u003erepresentation\u003c/code\u003e\n     * @return list with the sequence values permuted according to the representation\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 32)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 71)",
        "(line 133,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.isSame(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 149,
      "end_line": 173,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ccode\u003eanother\u003c/code\u003e is a RandomKey and\n     * encodes the same permutation.\n     *\n     * @param another chromosome to compare\n     * @return true iff chromosomes encode the same permutation\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 56)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 163,col 9)-(line 163,col 57)",
        "(line 164,col 9)-(line 164,col 65)",
        "(line 166,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.checkValidity(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 178,
      "end_line": 186,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.randomPermutation(int)",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\n     * Generates a representation corresponding to a random permutation of\n     * length l which can be passed to the RandomKey constructor.\n     *\n     * @param l\n     *            length of the permutation\n     * @return representation of a random permutation\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 53)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.identityPermutation(int)",
      "begin_line": 213,
      "end_line": 219,
      "comment": "\n     * Generates a representation corresponding to an identity permutation of\n     * length l which can be passed to the RandomKey constructor.\n     *\n     * @param l\n     *            length of the permutation\n     * @return representation of an identity permutation\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 53)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.comparatorPermutation(java.util.List\u003cS\u003e, java.util.Comparator\u003cS\u003e)",
      "begin_line": 234,
      "end_line": 239,
      "comment": "\n     * Generates a representation of a permutation corresponding to the\n     * \u003ccode\u003edata\u003c/code\u003e sorted by \u003ccode\u003ecomparator\u003c/code\u003e. The\n     * \u003ccode\u003edata\u003c/code\u003e is not modified during the process.\n     *\n     * This is useful if you want to inject some permutations to the initial\n     * population.\n     *\n     * @param \u003cS\u003e type of the data\n     * @param data list of data determining the order\n     * @param comparator how the data will be compared\n     * @return list representation of the permutation corresponding to the parameters\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 53)",
        "(line 236,col 9)-(line 236,col 49)",
        "(line 238,col 9)-(line 238,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.inducedPermutation(java.util.List\u003cS\u003e, java.util.List\u003cS\u003e)",
      "begin_line": 254,
      "end_line": 272,
      "comment": "\n     * Generates a representation of a permutation corresponding to a\n     * permutation which yields \u003ccode\u003epermutedData\u003c/code\u003e when applied to\n     * \u003ccode\u003eoriginalData\u003c/code\u003e.\n     *\n     * This method can be viewed as an inverse to {@link #decode(List)}.\n     *\n     * @param \u003cS\u003e type of the data\n     * @param originalData the original, unpermuted data\n     * @param permutedData the data, somehow permuted\n     * @return representation of a permutation corresponding to the permutation \u003ccode\u003eoriginalData -\u003e permutedData\u003c/code\u003e\n     * @throws IllegalArgumentException iff the \u003ccode\u003epermutedData\u003c/code\u003e and \u003ccode\u003eoriginalData\u003c/code\u003e contains different data\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 36)",
        "(line 260,col 9)-(line 260,col 63)",
        "(line 262,col 9)-(line 262,col 37)",
        "(line 263,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.toString()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.RandomKey.baseSequence(int)",
      "begin_line": 288,
      "end_line": 294,
      "comment": "\n     * Helper for constructor. Generates a list of natural numbers (0,1,...,l-1).\n     *\n     * @param l length of list to generate\n     * @return list of integers from 0 to l-1\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 64)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 28)"
      ]
    }
  ]
}