{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/random/RandomGeneratorFactory.java",
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
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-ef174ada-83a7-4a16-b05e-a2142ecc2d9e.setSeed(int)",
      "begin_line": 45,
      "end_line": 47,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 46,col 17)-(line 46,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-f002df0c-e981-4116-865f-d0a1e102c2ce.setSeed(int[])",
      "begin_line": 50,
      "end_line": 52,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 51,col 17)-(line 51,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-8b07fd40-1168-45f8-a98d-a450bfc5853a.setSeed(long)",
      "begin_line": 55,
      "end_line": 57,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 56,col 17)-(line 56,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-2d8cf314-be03-4dba-96c4-41fcb09c3065.nextBytes(byte[])",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 17)-(line 61,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-67a20e41-4ce1-45e3-b0a6-97ce5f3294d2.nextInt()",
      "begin_line": 65,
      "end_line": 67,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 66,col 17)-(line 66,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-2ff6fd25-9e58-4473-8b8d-c4e4569199a5.nextInt(int)",
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
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-4d160c1a-1672-4fc2-951a-2948d2e9d403.nextLong()",
      "begin_line": 78,
      "end_line": 80,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 79,col 17)-(line 79,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-d678f97b-0487-49b4-b539-f6e4b3e703fd.nextBoolean()",
      "begin_line": 83,
      "end_line": 85,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 84,col 17)-(line 84,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-2f5fe85a-f65e-4f6a-b0ec-3ee4d519044d.nextFloat()",
      "begin_line": 88,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 17)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-db4b389b-65df-4199-affc-eeb8cc873464.nextDouble()",
      "begin_line": 93,
      "end_line": 95,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 94,col 17)-(line 94,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.RandomGeneratorFactory.Anonymous-896475d9-f122-4abf-bbda-02b6ac819e6b.nextGaussian()",
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