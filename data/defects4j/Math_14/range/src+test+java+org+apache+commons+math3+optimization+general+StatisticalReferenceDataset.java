{
  "filepath": "/tmp/Math-14b/src/test/java/org/apache/commons/math3/optimization/general/StatisticalReferenceDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalReferenceDataset",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 366,
      "comment": "\n * This class gives access to the statistical reference datasets provided by the\n * NIST (available\n * \u003ca href\u003d\"http://www.itl.nist.gov/div898/strd/general/dataarchive.html\"\u003ehere\u003c/a\u003e).\n * Instances of this class can be created by invocation of the\n * {@link StatisticalReferenceDatasetFactory}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The name of this dataset. "
    },
    {
      "type": "field",
      "varNames": [
        "numObservations"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The total number of observations (data points). "
    },
    {
      "type": "field",
      "varNames": [
        "numParameters"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The total number of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "numStartingPoints"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The total number of starting points for the optimizations. "
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The values of the predictor. "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The values of the response. "
    },
    {
      "type": "field",
      "varNames": [
        "startingValues"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * The starting values. {@code startingValues[j][i]} is the value of the\n     * {@code i}-th parameter in the {@code j}-th set of starting values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " The certified values of the parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "sigA"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " The certified values of the standard deviation of the parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "residualSumOfSquares"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " The certified value of the residual sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "problem"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The least-squares problem. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.StatisticalReferenceDataset(java.io.BufferedReader)",
      "begin_line": 79,
      "end_line": 178,
      "comment": "\n     * Creates a new instance of this class from the specified data file. The\n     * file must follow the StRD format.\n     *\n     * @param in the data file\n     * @throws IOException if an I/O error occurs\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 64)",
        "(line 83,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 53)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 55)",
        "(line 91,col 9)-(line 91,col 50)",
        "(line 92,col 9)-(line 92,col 50)",
        "(line 93,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 58)",
        "(line 102,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 53)",
        "(line 108,col 9)-(line 108,col 32)",
        "(line 109,col 9)-(line 109,col 43)",
        "(line 110,col 9)-(line 110,col 46)",
        "(line 111,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 46)",
        "(line 127,col 9)-(line 127,col 36)",
        "(line 129,col 9)-(line 129,col 40)",
        "(line 130,col 9)-(line 130,col 34)",
        "(line 131,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 146,col 48)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 32)",
        "(line 153,col 9)-(line 177,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.Anonymous-b2f0f21b-702f-4828-a397-ca12c99a1d06.value(double[])",
      "begin_line": 155,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 156,col 17)-(line 156,col 78)",
        "(line 157,col 17)-(line 159,col 17)",
        "(line 160,col 17)-(line 160,col 51)",
        "(line 161,col 17)-(line 161,col 52)",
        "(line 162,col 17)-(line 164,col 17)",
        "(line 165,col 17)-(line 165,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.Anonymous-21017b79-e9ca-471c-beb8-df72df21ff0f.value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 168,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 169,col 17)-(line 169,col 51)",
        "(line 170,col 17)-(line 170,col 78)",
        "(line 171,col 17)-(line 173,col 17)",
        "(line 174,col 17)-(line 174,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getName()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Returns the name of this dataset.\n     *\n     * @return the name of the dataset\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getNumObservations()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Returns the total number of observations (data points).\n     *\n     * @return the number of observations\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getData()",
      "begin_line": 204,
      "end_line": 208,
      "comment": "\n     * Returns a copy of the data arrays. The data is laid out as follows \u003cli\u003e\n     * {@code data[0][i] \u003d x[i]},\u003c/li\u003e \u003cli\u003e{@code data[1][i] \u003d y[i]},\u003c/li\u003e\n     *\n     * @return the array of data points.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 207,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getX(int)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Returns the x-value of the {@code i}-th data point.\n     *\n     * @param i the index of the data point\n     * @return the x-value\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getY(int)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Returns the y-value of the {@code i}-th data point.\n     *\n     * @param i the index of the data point\n     * @return the y-value\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getNumParameters()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Returns the total number of parameters.\n     *\n     * @return the number of parameters\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getParameters()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Returns the certified values of the paramters.\n     *\n     * @return the values of the parameters\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getParameter(int)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\n     * Returns the certified value of the {@code i}-th parameter.\n     *\n     * @param i the index of the parameter\n     * @return the value of the parameter\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getParametersStandardDeviations()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Reurns the certified values of the standard deviations of the parameters.\n     *\n     * @return the standard deviations of the parameters\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getParameterStandardDeviation(int)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Returns the certified value of the standard deviation of the {@code i}-th\n     * parameter.\n     *\n     * @param i the index of the parameter\n     * @return the standard deviation of the parameter\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getResidualSumOfSquares()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns the certified value of the residual sum of squares.\n     *\n     * @return the residual sum of squares\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getNumStartingPoints()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Returns the total number of starting points (initial guesses for the\n     * optimization process).\n     *\n     * @return the number of starting points\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getStartingPoint(int)",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Returns the {@code i}-th set of initial values of the parameters.\n     *\n     * @param i the index of the starting point\n     * @return the starting point\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getLeastSquaresProblem()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Returns the least-squares problem corresponding to fitting the model to\n     * the specified data.\n     *\n     * @return the least-squares problem\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.getModelValue(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 325,
      "end_line": 325,
      "comment": "\n     * Returns the value of the model for the specified values of the predictor\n     * variable and the parameters.\n     *\n     * @param x the predictor variable\n     * @param a the parameters\n     * @return the value of the model\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.general.StatisticalReferenceDataset.findLineNumbers(java.lang.String, java.lang.Iterable\u003cjava.lang.String\u003e)",
      "begin_line": 348,
      "end_line": 365,
      "comment": "\n     * \u003cp\u003e\n     * Parses the specified text lines, and extracts the indices of the first\n     * and last lines of the data defined by the specified {@code key}. This key\n     * must be one of\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e{@code \"Starting Values\"},\u003c/li\u003e\n     * \u003cli\u003e{@code \"Certified Values\"},\u003c/li\u003e\n     * \u003cli\u003e{@code \"Data\"}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * In the NIST data files, the line indices are separated by the keywords\n     * {@code \"lines\"} and {@code \"to\"}.\n     * \u003c/p\u003e\n     *\n     * @param lines the line of text to be parsed\n     * @return an array of two {@code int}s. First value is the index of the\n     *         first line, second value is the index of the last line.\n     *         {@code null} if the line could not be parsed.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 20)"
      ]
    }
  ]
}