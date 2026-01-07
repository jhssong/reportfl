{
  "filepath": "/tmp/Math-81b/src/test/java/org/apache/commons/math/genetics/GeneticAlgorithmTestBinary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithmTestBinary",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 121,
      "comment": "\n * This is also an example of usage.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIMENSION"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " parameters for the GA"
    },
    {
      "type": "field",
      "varNames": [
        "POPULATION_SIZE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUM_GENERATIONS"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ELITISM_RATE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CROSSOVER_RATE"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MUTATION_RATE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOURNAMENT_ARITY"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.test()",
      "begin_line": 39,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 50,col 10)",
        "(line 53,col 9)-(line 53,col 48)",
        "(line 55,col 9)-(line 55,col 79)",
        "(line 58,col 9)-(line 58,col 64)",
        "(line 61,col 9)-(line 61,col 66)",
        "(line 64,col 9)-(line 64,col 70)",
        "(line 69,col 9)-(line 69,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.randomPopulation()",
      "begin_line": 81,
      "end_line": 89,
      "comment": "\n     * Initializes a random population.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 64)",
        "(line 84,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindOnes",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.BinaryChromosome"
      ],
      "begin_line": 96,
      "end_line": 120,
      "comment": "\n     * Chromosomes represented by a binary chromosome.\n     *\n     * The goal is to set all bits (genes) to 1.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.FindOnes.FindOnes(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 13)-(line 99,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.FindOnes.fitness()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n         * Returns number of elements !\u003d 0\n         ",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 24)",
        "(line 107,col 13)-(line 110,col 13)",
        "(line 112,col 13)-(line 112,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.FindOnes.newFixedLengthChromosome(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 115,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 58)"
      ]
    }
  ]
}