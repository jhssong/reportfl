{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/genetics/GeneticAlgorithmTestBinary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithmTestBinary",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 123,
      "comment": "\n * This is also an example of usage.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIMENSION"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " parameters for the GA"
    },
    {
      "type": "field",
      "varNames": [
        "POPULATION_SIZE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUM_GENERATIONS"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ELITISM_RATE"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CROSSOVER_RATE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MUTATION_RATE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOURNAMENT_ARITY"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestBinary.test()",
      "begin_line": 40,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 51,col 10)",
        "(line 53,col 9)-(line 53,col 59)",
        "(line 56,col 9)-(line 56,col 48)",
        "(line 58,col 9)-(line 58,col 79)",
        "(line 61,col 9)-(line 61,col 64)",
        "(line 64,col 9)-(line 64,col 66)",
        "(line 67,col 9)-(line 67,col 70)",
        "(line 72,col 9)-(line 72,col 64)",
        "(line 73,col 9)-(line 73,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestBinary.randomPopulation()",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\n     * Initializes a random population.\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 64)",
        "(line 86,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindOnes",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.BinaryChromosome"
      ],
      "begin_line": 98,
      "end_line": 122,
      "comment": "\n     * Chromosomes represented by a binary chromosome.\n     *\n     * The goal is to set all bits (genes) to 1.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestBinary.FindOnes.FindOnes(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 13)-(line 101,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestBinary.FindOnes.fitness()",
      "begin_line": 107,
      "end_line": 115,
      "comment": "\n         * Returns number of elements !\u003d 0\n         ",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 24)",
        "(line 109,col 13)-(line 112,col 13)",
        "(line 114,col 13)-(line 114,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestBinary.FindOnes.newFixedLengthChromosome(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 58)"
      ]
    }
  ]
}