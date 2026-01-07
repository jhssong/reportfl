{
  "filepath": "/tmp/Math-11b/src/test/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/StatisticalReferenceDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalReferenceDataset",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 383,
      "comment": "\n * This class gives access to the statistical reference datasets provided by the\n * NIST (available\n * \u003ca href\u003d\"http://www.itl.nist.gov/div898/strd/general/dataarchive.html\"\u003ehere\u003c/a\u003e).\n * Instances of this class can be created by invocation of the\n * {@link StatisticalReferenceDatasetFactory}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " The name of this dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "numObservations"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The total number of observations (data points). "
    },
    {
      "type": "field",
      "varNames": [
        "numParameters"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The total number of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "numStartingPoints"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The total number of starting points for the optimizations. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The values of the predictor. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The values of the response. "
    },
    {
      "type": "field",
      "varNames": [
        "startingValues"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * The starting values. {@code startingValues[j][i]} is the value of the\n     * {@code i}-th parameter in the {@code j}-th set of starting values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The certified values of the parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "sigA"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " The certified values of the standard deviation of the parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "residualSumOfSquares"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The certified value of the residual sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "problem"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " The least-squares problem. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.StatisticalReferenceDataset(java.io.BufferedReader)",
      "begin_line": 80,
      "end_line": 155,
      "comment": "\n     * Creates a new instance of this class from the specified data file. The\n     * file must follow the StRD format.\n     *\n     * @param in the data file\n     * @throws IOException if an I/O error occurs\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 64)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 53)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 55)",
        "(line 92,col 9)-(line 92,col 50)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 94,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 102,col 58)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 53)",
        "(line 109,col 9)-(line 109,col 32)",
        "(line 110,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 111,col 46)",
        "(line 112,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 128,col 36)",
        "(line 130,col 9)-(line 130,col 40)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 48)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 32)",
        "(line 154,col 9)-(line 154,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LeastSquaresProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 157,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.LeastSquaresProblem.getModelFunction()",
      "begin_line": 158,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 168,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.LeastSquaresProblem.Anonymous-72e13448-8c0a-499d-9b0f-a9398b611f76.value(double[])",
      "begin_line": 160,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 161,col 25)-(line 161,col 59)",
        "(line 162,col 25)-(line 162,col 60)",
        "(line 163,col 25)-(line 165,col 25)",
        "(line 166,col 25)-(line 166,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.LeastSquaresProblem.getModelFunctionJacobian()",
      "begin_line": 171,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 172,col 13)-(line 182,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.LeastSquaresProblem.Anonymous-03d22ab1-39db-41d1-86b6-2be1143cc20b.value(double[])",
      "begin_line": 173,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 175,col 25)-(line 175,col 59)",
        "(line 176,col 25)-(line 176,col 61)",
        "(line 177,col 25)-(line 179,col 25)",
        "(line 180,col 25)-(line 180,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getName()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Returns the name of this dataset.\n     *\n     * @return the name of the dataset\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getNumObservations()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns the total number of observations (data points).\n     *\n     * @return the number of observations\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getData()",
      "begin_line": 210,
      "end_line": 214,
      "comment": "\n     * Returns a copy of the data arrays. The data is laid out as follows \u003cli\u003e\n     * {@code data[0][i] \u003d x[i]},\u003c/li\u003e \u003cli\u003e{@code data[1][i] \u003d y[i]},\u003c/li\u003e\n     *\n     * @return the array of data points.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getX(int)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns the x-value of the {@code i}-th data point.\n     *\n     * @param i the index of the data point\n     * @return the x-value\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getY(int)",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Returns the y-value of the {@code i}-th data point.\n     *\n     * @param i the index of the data point\n     * @return the y-value\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getNumParameters()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Returns the total number of parameters.\n     *\n     * @return the number of parameters\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getParameters()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns the certified values of the paramters.\n     *\n     * @return the values of the parameters\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getParameter(int)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns the certified value of the {@code i}-th parameter.\n     *\n     * @param i the index of the parameter\n     * @return the value of the parameter\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getParametersStandardDeviations()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Reurns the certified values of the standard deviations of the parameters.\n     *\n     * @return the standard deviations of the parameters\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getParameterStandardDeviation(int)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Returns the certified value of the standard deviation of the {@code i}-th\n     * parameter.\n     *\n     * @param i the index of the parameter\n     * @return the standard deviation of the parameter\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getResidualSumOfSquares()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns the certified value of the residual sum of squares.\n     *\n     * @return the residual sum of squares\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getNumStartingPoints()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Returns the total number of starting points (initial guesses for the\n     * optimization process).\n     *\n     * @return the number of starting points\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getStartingPoint(int)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns the {@code i}-th set of initial values of the parameters.\n     *\n     * @param i the index of the starting point\n     * @return the starting point\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getLeastSquaresProblem()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Returns the least-squares problem corresponding to fitting the model to\n     * the specified data.\n     *\n     * @return the least-squares problem\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getModelValue(double, double[])",
      "begin_line": 331,
      "end_line": 331,
      "comment": "\n     * Returns the value of the model for the specified values of the predictor\n     * variable and the parameters.\n     *\n     * @param x the predictor variable\n     * @param a the parameters\n     * @return the value of the model\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.getModelDerivatives(double, double[])",
      "begin_line": 341,
      "end_line": 342,
      "comment": "\n     * Returns the values of the partial derivatives of the model with respect\n     * to the parameters.\n     *\n     * @param x the predictor variable\n     * @param a the parameters\n     * @return the partial derivatives\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.StatisticalReferenceDataset.findLineNumbers(java.lang.String, java.lang.Iterable\u003cjava.lang.String\u003e)",
      "begin_line": 365,
      "end_line": 382,
      "comment": "\n     * \u003cp\u003e\n     * Parses the specified text lines, and extracts the indices of the first\n     * and last lines of the data defined by the specified {@code key}. This key\n     * must be one of\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@code \"Starting Values\"},\u003c/li\u003e\n     * \u003cli\u003e{@code \"Certified Values\"},\u003c/li\u003e\n     * \u003cli\u003e{@code \"Data\"}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * In the NIST data files, the line indices are separated by the keywords\n     * {@code \"lines\"} and {@code \"to\"}.\n     * \u003c/p\u003e\n     *\n     * @param lines the line of text to be parsed\n     * @return an array of two {@code int}s. First value is the index of the\n     *         first line, second value is the index of the last line.\n     *         {@code null} if the line could not be parsed.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 20)"
      ]
    }
  ]
}