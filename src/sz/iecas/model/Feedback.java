package sz.iecas.model;

public class Feedback {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Feedback_id
     *
     * @mbggenerated
     */
    private Integer feedbackId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column feedback.Feedback_text
     *
     * @mbggenerated
     */
    private String feedbackText;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Feedback_id
     *
     * @return the value of feedback.Feedback_id
     *
     * @mbggenerated
     */
    public Integer getFeedbackId() {
        return feedbackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Feedback_id
     *
     * @param feedbackId the value for feedback.Feedback_id
     *
     * @mbggenerated
     */
    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column feedback.Feedback_text
     *
     * @return the value of feedback.Feedback_text
     *
     * @mbggenerated
     */
    public String getFeedbackText() {
        return feedbackText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column feedback.Feedback_text
     *
     * @param feedbackText the value for feedback.Feedback_text
     *
     * @mbggenerated
     */
    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText == null ? null : feedbackText.trim();
    }
}