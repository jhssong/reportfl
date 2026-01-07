{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/fitting/leastsquares/StatisticalReferenceDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalReferenceDataset",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 370,
      "comment": "\n * This class gives access to the statistical reference datasets provided by the\n * NIST (available\n * \u003ca href\u003d\"http://www.itl.nist.gov/div898/strd/general/dataarchive.html\"\u003ehere\u003c/a\u003e).\n * Instances of this class can be created by invocation of the\n * {@link StatisticalReferenceDatasetFactory}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The name of this dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "numObservations"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The total number of observations (data points). "
    },
    {
      "type": "field",
      "varNames": [
        "numParameters"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The total number of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "numStartingPoints"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The total number of starting points for the optimizations. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The values of the predictor. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The values of the response. "
    },
    {
      "type": "field",
      "varNames": [
        "startingValues"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * The starting values. {@code startingValues[j][i]} is the value of the\n     * {@code i}-th parameter in the {@code j}-th set of starting values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The certified values of the parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "sigA"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The certified values of the standard deviation of the parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "residualSumOfSquares"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The certified value of the residual sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "problem"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The least-squares problem. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.StatisticalReferenceDataset(java.io.BufferedReader)",
      "begin_line": 67,
      "end_line": 142,
      "comment": "\n     * Creates a new instance of this class from the specified data file. The\n     * file must follow the StRD format.\n     *\n     * @param in the data file\n     * @throws IOException if an I/O error occurs\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 64)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 53)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 55)",
        "(line 79,col 9)-(line 79,col 50)",
        "(line 80,col 9)-(line 80,col 50)",
        "(line 81,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 58)",
        "(line 90,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 53)",
        "(line 96,col 9)-(line 96,col 32)",
        "(line 97,col 9)-(line 97,col 43)",
        "(line 98,col 9)-(line 98,col 46)",
        "(line 99,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 46)",
        "(line 115,col 9)-(line 115,col 36)",
        "(line 117,col 9)-(line 117,col 40)",
        "(line 118,col 9)-(line 118,col 34)",
        "(line 119,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 48)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 32)",
        "(line 141,col 9)-(line 141,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LeastSquaresProblem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 144,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.LeastSquaresProblem.getModelFunction()",
      "begin_line": 145,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 146,col 13)-(line 155,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.LeastSquaresProblem.Anonymous-ab289836-6233-4cb5-9243-e6faa2e5990a.value(double[])",
      "begin_line": 147,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 148,col 21)-(line 148,col 55)",
        "(line 149,col 21)-(line 149,col 56)",
        "(line 150,col 21)-(line 152,col 21)",
        "(line 153,col 21)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.LeastSquaresProblem.getModelFunctionJacobian()",
      "begin_line": 158,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 169,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.LeastSquaresProblem.Anonymous-5d523a0f-6a6c-4f8f-9edc-cad029689c98.value(double[])",
      "begin_line": 160,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 162,col 21)-(line 162,col 55)",
        "(line 163,col 21)-(line 163,col 57)",
        "(line 164,col 21)-(line 166,col 21)",
        "(line 167,col 21)-(line 167,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getName()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Returns the name of this dataset.\n     *\n     * @return the name of the dataset\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getNumObservations()",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Returns the total number of observations (data points).\n     *\n     * @return the number of observations\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getData()",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\n     * Returns a copy of the data arrays. The data is laid out as follows \u003cli\u003e\n     * {@code data[0][i] \u003d x[i]},\u003c/li\u003e \u003cli\u003e{@code data[1][i] \u003d y[i]},\u003c/li\u003e\n     *\n     * @return the array of data points.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getX(int)",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Returns the x-value of the {@code i}-th data point.\n     *\n     * @param i the index of the data point\n     * @return the x-value\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getY(int)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Returns the y-value of the {@code i}-th data point.\n     *\n     * @param i the index of the data point\n     * @return the y-value\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getNumParameters()",
      "begin_line": 228,
      "end_line": 230,
      "comment": "\n     * Returns the total number of parameters.\n     *\n     * @return the number of parameters\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getParameters()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Returns the certified values of the paramters.\n     *\n     * @return the values of the parameters\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getParameter(int)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Returns the certified value of the {@code i}-th parameter.\n     *\n     * @param i the index of the parameter\n     * @return the value of the parameter\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getParametersStandardDeviations()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Reurns the certified values of the standard deviations of the parameters.\n     *\n     * @return the standard deviations of the parameters\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getParameterStandardDeviation(int)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Returns the certified value of the standard deviation of the {@code i}-th\n     * parameter.\n     *\n     * @param i the index of the parameter\n     * @return the standard deviation of the parameter\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getResidualSumOfSquares()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the certified value of the residual sum of squares.\n     *\n     * @return the residual sum of squares\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getNumStartingPoints()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Returns the total number of starting points (initial guesses for the\n     * optimization process).\n     *\n     * @return the number of starting points\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getStartingPoint(int)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * Returns the {@code i}-th set of initial values of the parameters.\n     *\n     * @param i the index of the starting point\n     * @return the starting point\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getLeastSquaresProblem()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * Returns the least-squares problem corresponding to fitting the model to\n     * the specified data.\n     *\n     * @return the least-squares problem\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getModelValue(double, double[])",
      "begin_line": 318,
      "end_line": 318,
      "comment": "\n     * Returns the value of the model for the specified values of the predictor\n     * variable and the parameters.\n     *\n     * @param x the predictor variable\n     * @param a the parameters\n     * @return the value of the model\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.getModelDerivatives(double, double[])",
      "begin_line": 328,
      "end_line": 329,
      "comment": "\n     * Returns the values of the partial derivatives of the model with respect\n     * to the parameters.\n     *\n     * @param x the predictor variable\n     * @param a the parameters\n     * @return the partial derivatives\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.StatisticalReferenceDataset.findLineNumbers(java.lang.String, java.lang.Iterable\u003cjava.lang.String\u003e)",
      "begin_line": 352,
      "end_line": 369,
      "comment": "\n     * \u003cp\u003e\n     * Parses the specified text lines, and extracts the indices of the first\n     * and last lines of the data defined by the specified {@code key}. This key\n     * must be one of\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@code \"Starting Values\"},\u003c/li\u003e\n     * \u003cli\u003e{@code \"Certified Values\"},\u003c/li\u003e\n     * \u003cli\u003e{@code \"Data\"}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * In the NIST data files, the line indices are separated by the keywords\n     * {@code \"lines\"} and {@code \"to\"}.\n     * \u003c/p\u003e\n     *\n     * @param lines the line of text to be parsed\n     * @return an array of two {@code int}s. First value is the index of the\n     *         first line, second value is the index of the last line.\n     *         {@code null} if the line could not be parsed.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 20)"
      ]
    }
  ]
}