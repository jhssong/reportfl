{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/genetics/GeneticAlgorithmTestBinary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithmTestBinary",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 122,
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
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 50,col 10)",
        "(line 52,col 9)-(line 52,col 52)",
        "(line 55,col 9)-(line 55,col 48)",
        "(line 57,col 9)-(line 57,col 79)",
        "(line 60,col 9)-(line 60,col 64)",
        "(line 63,col 9)-(line 63,col 66)",
        "(line 66,col 9)-(line 66,col 70)",
        "(line 71,col 9)-(line 71,col 57)",
        "(line 72,col 9)-(line 72,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.randomPopulation()",
      "begin_line": 82,
      "end_line": 90,
      "comment": "\n     * Initializes a random population.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 64)",
        "(line 85,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FindOnes",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.BinaryChromosome"
      ],
      "begin_line": 97,
      "end_line": 121,
      "comment": "\n     * Chromosomes represented by a binary chromosome.\n     *\n     * The goal is to set all bits (genes) to 1.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.FindOnes.FindOnes(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.FindOnes.fitness()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "\n         * Returns number of elements !\u003d 0\n         ",
      "child_ranges": [
        "(line 107,col 13)-(line 107,col 24)",
        "(line 108,col 13)-(line 111,col 13)",
        "(line 113,col 13)-(line 113,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestBinary.FindOnes.newFixedLengthChromosome(java.util.List\u003cjava.lang.Integer\u003e)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 58)"
      ]
    }
  ]
}