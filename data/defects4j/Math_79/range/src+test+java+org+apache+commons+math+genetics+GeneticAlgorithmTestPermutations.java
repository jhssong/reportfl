{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/genetics/GeneticAlgorithmTestPermutations.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GeneticAlgorithmTestPermutations",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 131,
      "comment": "\n * This is also an example of usage.\n *\n * This algorithm does \"stochastic sorting\" of a sequence 0,...,N.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "DIMENSION"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " parameters for the GA"
    },
    {
      "type": "field",
      "varNames": [
        "POPULATION_SIZE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NUM_GENERATIONS"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ELITISM_RATE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CROSSOVER_RATE"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MUTATION_RATE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOURNAMENT_ARITY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " numbers from 0 to N-1"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestPermutations.test()",
      "begin_line": 51,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 62,col 10)",
        "(line 65,col 9)-(line 65,col 48)",
        "(line 67,col 9)-(line 67,col 79)",
        "(line 70,col 9)-(line 70,col 64)",
        "(line 73,col 9)-(line 73,col 66)",
        "(line 76,col 9)-(line 76,col 70)",
        "(line 81,col 9)-(line 81,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestPermutations.randomPopulation()",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\n     * Initializes a random population\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 63)",
        "(line 93,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 82)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinPermutations",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.genetics.RandomKey\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 105,
      "end_line": 130,
      "comment": "\n     * Chromosomes representing a permutation of (0,1,2,...,DIMENSION-1).\n     *\n     * The goal is to sort the sequence.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestPermutations.MinPermutations.MinPermutations(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestPermutations.MinPermutations.fitness()",
      "begin_line": 111,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 24)",
        "(line 113,col 13)-(line 113,col 53)",
        "(line 114,col 13)-(line 120,col 13)",
        "(line 123,col 13)-(line 123,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.genetics.GeneticAlgorithmTestPermutations.MinPermutations.newFixedLengthChromosome(java.util.List\u003cjava.lang.Double\u003e)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 65)"
      ]
    }
  ]
}