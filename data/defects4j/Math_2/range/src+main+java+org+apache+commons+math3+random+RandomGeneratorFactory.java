{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/random/RandomGeneratorFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomGeneratorFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 122,
      "comment": "\n * Utilities for creating {@link RandomGenerator} instances.\n *\n * @since 3.3\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.RandomGeneratorFactory()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.createRandomGenerator(java.util.Random)",
      "begin_line": 42,
      "end_line": 102,
      "comment": "\n     * Creates a {@link RandomDataGenerator} instance that wraps a\n     * {@link Random} instance.\n     *\n     * @param rng JDK {@link Random} instance that will generate the\n     * the random data.\n     * @return the given RNG, wrapped in a {@link RandomGenerator}.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 101,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-d9e8e4be-c0ae-4be3-b76d-15b3973f1952.setSeed(int)",
      "begin_line": 45,
      "end_line": 47,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 46,col 17)-(line 46,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-02a2004b-52a7-4474-92c0-c8526f382cea.setSeed(int[])",
      "begin_line": 50,
      "end_line": 52,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 51,col 17)-(line 51,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-59c9dae3-3203-4f0e-831f-61cc9a6b006a.setSeed(long)",
      "begin_line": 55,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 56,col 17)-(line 56,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-58ba8eb7-5193-470b-b683-c9cc414b0171.nextBytes(byte[])",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 17)-(line 61,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-162152ff-f99b-42f5-8c9a-87c0f0eae24c.nextInt()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 17)-(line 66,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-69b89a11-ceb2-4123-8a8e-ef6be95c31b0.nextInt(int)",
      "begin_line": 70,
      "end_line": 75,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 17)-(line 73,col 17)",
        "(line 74,col 17)-(line 74,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-578a9e63-29f2-4073-88c2-01508ea2639c.nextLong()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 17)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-8f6fcb3c-7c40-49c6-80e7-9ccb24fed974.nextBoolean()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 17)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-ba9b9e76-85e5-4855-b6a9-5633a9856b3b.nextFloat()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 17)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-818483c2-b553-4edc-87d0-5c85745fb343.nextDouble()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 17)-(line 94,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-3849ef7d-c916-4b80-a008-6f7bf6891797.nextGaussian()",
      "begin_line": 98,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 17)-(line 99,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.convertToLong(int[])",
      "begin_line": 110,
      "end_line": 121,
      "comment": "\n     * Converts seed from one representation to another.\n     *\n     * @param seed Original seed.\n     * @return the converted seed.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 39)",
        "(line 115,col 9)-(line 115,col 27)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 24)"
      ]
    }
  ]
}