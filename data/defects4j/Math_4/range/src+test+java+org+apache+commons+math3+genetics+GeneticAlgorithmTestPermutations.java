{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/genetics/GeneticAlgorithmTestPermutations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithmTestPermutations",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 132,
      "comment": "\n * This is also an example of usage.\n *\n * This algorithm does \"stochastic sorting\" of a sequence 0,...,N.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIMENSION"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " parameters for the GA"
    },
    {
      "type": "field",
      "varNames": [
        "POPULATION_SIZE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUM_GENERATIONS"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ELITISM_RATE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CROSSOVER_RATE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MUTATION_RATE"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOURNAMENT_ARITY"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " numbers from 0 to N-1"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestPermutations.test()",
      "begin_line": 52,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 63,col 10)",
        "(line 66,col 9)-(line 66,col 48)",
        "(line 68,col 9)-(line 68,col 79)",
        "(line 71,col 9)-(line 71,col 64)",
        "(line 74,col 9)-(line 74,col 66)",
        "(line 77,col 9)-(line 77,col 70)",
        "(line 82,col 9)-(line 82,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestPermutations.randomPopulation()",
      "begin_line": 92,
      "end_line": 99,
      "comment": "\n     * Initializes a random population\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 63)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinPermutations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.genetics.RandomKey\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 106,
      "end_line": 131,
      "comment": "\n     * Chromosomes representing a permutation of (0,1,2,...,DIMENSION-1).\n     *\n     * The goal is to sort the sequence.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestPermutations.MinPermutations.MinPermutations(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestPermutations.MinPermutations.fitness()",
      "begin_line": 112,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 24)",
        "(line 114,col 13)-(line 114,col 53)",
        "(line 115,col 13)-(line 121,col 13)",
        "(line 124,col 13)-(line 124,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.genetics.GeneticAlgorithmTestPermutations.MinPermutations.newFixedLengthChromosome(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 127,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 65)"
      ]
    }
  ]
}