{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/sequence/CommandVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 120,
      "end_line": 143,
      "comment": "\n * This interface should be implemented by user object to walk\n * through {@link EditScript EditScript} objects.\n * \u003cp\u003e\n * Users should implement this interface in order to walk through\n * the {@link EditScript EditScript} object created by the comparison\n * of two sequences. This is a direct application of the visitor\n * design pattern. The {@link EditScript#visit EditScript.visit}\n * method takes an object implementing this interface as an argument,\n * it will perform the loop over all commands in the script and the\n * proper methods of the user class will be called as the commands are\n * encountered.\n * \u003cp\u003e\n * The implementation of the user visitor class will depend on the\n * need. Here are two examples.\n * \u003cp\u003e\n * The first example is a visitor that build the longest common\n * subsequence:\n * \u003cpre\u003e\n * import org.apache.commons.collections4.comparators.sequence.CommandVisitor;\n *\n * import java.util.ArrayList;\n *\n * public class LongestCommonSubSequence implements CommandVisitor {\n *\n *   public LongestCommonSubSequence() {\n *     a \u003d new ArrayList();\n *   }\n *\n *   public void visitInsertCommand(Object object) {\n *   }\n *\n *   public void visitKeepCommand(Object object) {\n *     a.add(object);\n *   }\n *\n *   public void visitDeleteCommand(Object object) {\n *   }\n *\n *   public Object[] getSubSequence() {\n *     return a.toArray();\n *   }\n *\n *   private ArrayList a;\n *\n * }\n * \u003c/pre\u003e\n * \u003cp\u003e\n * The second example is a visitor that shows the commands and the way\n * they transform the first sequence into the second one:\n * \u003cpre\u003e\n * import org.apache.commons.collections4.comparators.sequence.CommandVisitor;\n *\n * import java.util.Arrays;\n * import java.util.ArrayList;\n * import java.util.Iterator;\n *\n * public class ShowVisitor implements CommandVisitor {\n *\n *   public ShowVisitor(Object[] sequence1) {\n *     v \u003d new ArrayList();\n *     v.addAll(Arrays.asList(sequence1));\n *     index \u003d 0;\n *   }\n *\n *   public void visitInsertCommand(Object object) {\n *     v.insertElementAt(object, index++);\n *     display(\"insert\", object);\n *   }\n *\n *   public void visitKeepCommand(Object object) {\n *     ++index;\n *     display(\"keep  \", object);\n *   }\n *\n *   public void visitDeleteCommand(Object object) {\n *     v.remove(index);\n *     display(\"delete\", object);\n *   }\n *\n *   private void display(String commandName, Object object) {\n *     System.out.println(commandName + \" \" + object + \" -\u003e\" + this);\n *   }\n *\n *   public String toString() {\n *     StringBuffer buffer \u003d new StringBuffer();\n *     for (Iterator iter \u003d v.iterator(); iter.hasNext();) {\n *       buffer.append(\u0027 \u0027).append(iter.next());\n *     }\n *     return buffer.toString();\n *   }\n *\n *   private ArrayList v;\n *   private int index;\n *\n * }\n * \u003c/pre\u003e\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.CommandVisitor.visitInsertCommand(T)",
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Method called when an insert command is encountered.\n     *\n     * @param object object to insert (this object comes from the second sequence)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.CommandVisitor.visitKeepCommand(T)",
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Method called when a keep command is encountered.\n     *\n     * @param object object to keep (this object comes from the first sequence)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.sequence.CommandVisitor.visitDeleteCommand(T)",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Method called when a delete command is encountered.\n     *\n     * @param object object to delete (this object comes from the first sequence)\n     ",
      "child_ranges": []
    }
  ]
}