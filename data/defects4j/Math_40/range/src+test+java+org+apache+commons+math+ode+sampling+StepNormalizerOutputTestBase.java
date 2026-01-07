{
  "filepath": "/tmp/Math-40b/src/test/java/org/apache/commons/math/ode/sampling/StepNormalizerOutputTestBase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizerOutputTestBase",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
        "org.apache.commons.math.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 14,
      "end_line": 223,
      "comment": " Base class for step normalizer output tests. "
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 18,
      "end_line": 18,
      "comment": " The normalized output time values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getStart()",
      "begin_line": 24,
      "end_line": 24,
      "comment": "\n     * Returns the start time.\n     * @return the start time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getEnd()",
      "begin_line": 30,
      "end_line": 30,
      "comment": "\n     * Returns the end time.\n     * @return the end time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpInc()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Returns the expected normalized output time values for increment mode.\n     * @return the expected normalized output time values for increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpIncRev()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * increment mode.\n     * @return the expected reversed normalized output time values for\n     * increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpMul()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns the expected normalized output time values for multiples mode.\n     * @return the expected normalized output time values for multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getExpMulRev()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * multiples mode.\n     * @return the expected reversed normalized output time values for\n     * multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getO()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Returns the offsets for the unit tests below, in the order they are\n     * given below. For each test, the left and right offsets are returned.\n     * @return the offsets for the unit tests below, in the order they are\n     * given below\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getArray(double[], int, int)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Get the array, given left and right offsets.\n     * @param a the input array\n     * @param offsetL the left side offset\n     * @param offsetR the right side offset\n     * @return the modified array\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 65)",
        "(line 77,col 9)-(line 77,col 59)",
        "(line 78,col 9)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncNeither()",
      "begin_line": 81,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 73)",
        "(line 84,col 9)-(line 84,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncNeitherRev()",
      "begin_line": 87,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 76)",
        "(line 90,col 9)-(line 90,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncFirst()",
      "begin_line": 93,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 73)",
        "(line 96,col 9)-(line 96,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncFirstRev()",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 76)",
        "(line 102,col 9)-(line 102,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncLast()",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 73)",
        "(line 108,col 9)-(line 108,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncLastRev()",
      "begin_line": 111,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 76)",
        "(line 114,col 9)-(line 114,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncBoth()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 73)",
        "(line 120,col 9)-(line 120,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testIncBothRev()",
      "begin_line": 123,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 76)",
        "(line 126,col 9)-(line 126,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulNeither()",
      "begin_line": 129,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 73)",
        "(line 132,col 9)-(line 132,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulNeitherRev()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 76)",
        "(line 138,col 9)-(line 138,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulFirst()",
      "begin_line": 141,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 75)",
        "(line 144,col 9)-(line 144,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulFirstRev()",
      "begin_line": 147,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 78)",
        "(line 150,col 9)-(line 150,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulLast()",
      "begin_line": 153,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 75)",
        "(line 156,col 9)-(line 156,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulLastRev()",
      "begin_line": 159,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 78)",
        "(line 162,col 9)-(line 162,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulBoth()",
      "begin_line": 165,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 75)",
        "(line 168,col 9)-(line 168,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.testMulBothRev()",
      "begin_line": 171,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 78)",
        "(line 174,col 9)-(line 174,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.doTest(org.apache.commons.math.ode.sampling.StepNormalizerMode, org.apache.commons.math.ode.sampling.StepNormalizerBounds, double[], boolean)",
      "begin_line": 186,
      "end_line": 202,
      "comment": "\n     * The actual step normalizer output test code, shared by all the unit\n     * tests.\n     *\n     * @param mode the step normalizer mode to use\n     * @param bounds the step normalizer bounds setting to use\n     * @param expected the expected output (normalized time points)\n     * @param reverse whether to reverse the integration direction\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 190,col 79)",
        "(line 191,col 9)-(line 191,col 74)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 193,col 9)-(line 193,col 57)",
        "(line 194,col 9)-(line 194,col 55)",
        "(line 195,col 9)-(line 195,col 47)",
        "(line 196,col 9)-(line 196,col 48)",
        "(line 197,col 9)-(line 197,col 52)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.getDimension()",
      "begin_line": 205,
      "end_line": 207,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.computeDerivatives(double, double[], double[])",
      "begin_line": 210,
      "end_line": 212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.init(double, double[], double)",
      "begin_line": 215,
      "end_line": 216,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.ode.sampling.StepNormalizerOutputTestBase.handleStep(double, double[], double[], boolean)",
      "begin_line": 219,
      "end_line": 221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 22)"
      ]
    }
  ]
}