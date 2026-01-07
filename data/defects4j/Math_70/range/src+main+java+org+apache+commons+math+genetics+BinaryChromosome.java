{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/genetics/BinaryChromosome.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BinaryChromosome",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.AbstractListChromosome\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 29,
      "end_line": 92,
      "comment": "\n * Chromosome represented by a vector of 0s and 1s.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.BinaryChromosome(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * Constructor.\n     * @param representation list of {0,1} values representing the chromosome\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.BinaryChromosome(java.lang.Integer[])",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructor.\n     * @param representation array of {0,1} values representing the chromosome\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.checkValidity(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 50,
      "end_line": 56,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 55,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.randomBinaryRepresentation(int)",
      "begin_line": 63,
      "end_line": 70,
      "comment": "\n     * Returns a representation of a random binary array of length \u003ccode\u003elength\u003c/code\u003e.\n     * @param length length of the array\n     * @return a random binary array of length \u003ccode\u003elength\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 61)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 69,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.BinaryChromosome.isSame(org.apache.commons.math.genetics.Chromosome)",
      "begin_line": 75,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 64)",
        "(line 82,col 9)-(line 83,col 25)",
        "(line 85,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 20)"
      ]
    }
  ]
}