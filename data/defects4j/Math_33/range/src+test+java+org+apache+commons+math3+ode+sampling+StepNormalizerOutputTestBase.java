{
  "filepath": "/tmp/Math-33b/src/test/java/org/apache/commons/math3/ode/sampling/StepNormalizerOutputTestBase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StepNormalizerOutputTestBase",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ode.FirstOrderDifferentialEquations",
        "org.apache.commons.math3.ode.sampling.FixedStepHandler"
      ],
      "begin_line": 31,
      "end_line": 240,
      "comment": " Base class for step normalizer output tests. "
    },
    {
      "type": "field",
      "varNames": [
        "output"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The normalized output time values. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getStart()",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Returns the start time.\n     * @return the start time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getEnd()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Returns the end time.\n     * @return the end time\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpInc()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Returns the expected normalized output time values for increment mode.\n     * @return the expected normalized output time values for increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpIncRev()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * increment mode.\n     * @return the expected reversed normalized output time values for\n     * increment mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpMul()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Returns the expected normalized output time values for multiples mode.\n     * @return the expected normalized output time values for multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getExpMulRev()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Returns the expected reversed normalized output time values for\n     * multiples mode.\n     * @return the expected reversed normalized output time values for\n     * multiples mode\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getO()",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Returns the offsets for the unit tests below, in the order they are\n     * given below. For each test, the left and right offsets are returned.\n     * @return the offsets for the unit tests below, in the order they are\n     * given below\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getArray(double[], int, int)",
      "begin_line": 92,
      "end_line": 96,
      "comment": "\n     * Get the array, given left and right offsets.\n     * @param a the input array\n     * @param offsetL the left side offset\n     * @param offsetR the right side offset\n     * @return the modified array\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 65)",
        "(line 94,col 9)-(line 94,col 59)",
        "(line 95,col 9)-(line 95,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncNeither()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 73)",
        "(line 101,col 9)-(line 101,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncNeitherRev()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 76)",
        "(line 107,col 9)-(line 107,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncFirst()",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 73)",
        "(line 113,col 9)-(line 113,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncFirstRev()",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 76)",
        "(line 119,col 9)-(line 119,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncLast()",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 73)",
        "(line 125,col 9)-(line 125,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncLastRev()",
      "begin_line": 128,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 76)",
        "(line 131,col 9)-(line 131,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncBoth()",
      "begin_line": 134,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 73)",
        "(line 137,col 9)-(line 137,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testIncBothRev()",
      "begin_line": 140,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 76)",
        "(line 143,col 9)-(line 143,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulNeither()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 73)",
        "(line 149,col 9)-(line 149,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulNeitherRev()",
      "begin_line": 152,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 76)",
        "(line 155,col 9)-(line 155,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulFirst()",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 75)",
        "(line 161,col 9)-(line 161,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulFirstRev()",
      "begin_line": 164,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 78)",
        "(line 167,col 9)-(line 167,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulLast()",
      "begin_line": 170,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 75)",
        "(line 173,col 9)-(line 173,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulLastRev()",
      "begin_line": 176,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 78)",
        "(line 179,col 9)-(line 179,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulBoth()",
      "begin_line": 182,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 75)",
        "(line 185,col 9)-(line 185,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.testMulBothRev()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 78)",
        "(line 191,col 9)-(line 191,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.doTest(org.apache.commons.math3.ode.sampling.StepNormalizerMode, org.apache.commons.math3.ode.sampling.StepNormalizerBounds, double[], boolean)",
      "begin_line": 203,
      "end_line": 219,
      "comment": "\n     * The actual step normalizer output test code, shared by all the unit\n     * tests.\n     *\n     * @param mode the step normalizer mode to use\n     * @param bounds the step normalizer bounds setting to use\n     * @param expected the expected output (normalized time points)\n     * @param reverse whether to reverse the integration direction\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 207,col 79)",
        "(line 208,col 9)-(line 208,col 74)",
        "(line 209,col 9)-(line 209,col 29)",
        "(line 210,col 9)-(line 210,col 57)",
        "(line 211,col 9)-(line 211,col 55)",
        "(line 212,col 9)-(line 212,col 47)",
        "(line 213,col 9)-(line 213,col 48)",
        "(line 214,col 9)-(line 214,col 52)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.getDimension()",
      "begin_line": 222,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.computeDerivatives(double, double[], double[])",
      "begin_line": 227,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.init(double, double[], double)",
      "begin_line": 232,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase.handleStep(double, double[], double[], boolean)",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 22)"
      ]
    }
  ]
}