{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/regression/UpdatingMultipleLinearRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UpdatingMultipleLinearRegression",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 94,
      "comment": "\n * An interface for regression models allowing for dynamic updating of the data.\n * That is, the entire data set need not be loaded into memory. As observations\n * become available, they can be added to the regression  model and an updated\n * estimate regression statistics can be calculated.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression.hasIntercept()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Returns true if a constant has been included false otherwise.\n     *\n     * @return true if constant exists, false otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression.getN()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the number of observations added to the regression model.\n     *\n     * @return Number of observations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression.addObservation(double[], double)",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Adds one observation to the regression model.\n     *\n     * @param x the independent variables which form the design matrix\n     * @param y the dependent or response variable\n     * @throws ModelSpecificationException if the length of {@code x} does not equal\n     * the number of independent variables in the model\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression.addObservations(double[][], double[])",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Adds a series of observations to the regression model. The lengths of\n     * x and y must be the same and x must be rectangular.\n     *\n     * @param x a series of observations on the independent variables\n     * @param y a series of observations on the dependent variable\n     * The length of x and y must be the same\n     * @throws ModelSpecificationException if {@code x} is not rectangular, does not match\n     * the length of {@code y} or does not contain sufficient data to estimate the model\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression.clear()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Clears internal buffers and resets the regression model. This means all\n     * data and derived values are initialized\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression.regress()",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Performs a regression on data present in buffers and outputs a RegressionResults object\n     * @return RegressionResults acts as a container of regression output\n     * @throws ModelSpecificationException if the model is not correctly specified\n     * @throws NoDataException if there is not sufficient data in the model to\n     * estimate the regression parameters\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression.regress(int[])",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Performs a regression on data present in buffers including only regressors\n     * indexed in variablesToInclude and outputs a RegressionResults object\n     * @param variablesToInclude an array of indices of regressors to include\n     * @return RegressionResults acts as a container of regression output\n     * @throws ModelSpecificationException if the model is not correctly specified\n     * @throws MathIllegalArgumentException if the variablesToInclude array is null or zero length\n     ",
      "child_ranges": []
    }
  ]
}