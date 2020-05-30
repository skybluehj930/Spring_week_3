<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<div class="container">
  <h2>${board} Form</h2>
  <form action="./${board}Write" method="post">
    <div class="form-group">
      <label for="num">Num:</label>
      <input type="text" class="form-control" id="num" placeholder="Enter Num" name="num">
    </div>
    
    <div class="form-group">
      <label for="title">Title:</label>
      <input type="text" class="form-control" id="title" placeholder="Enter Title" name="title">
    </div>
    
    <div class="form-group">
      <label for="writer">Writer:</label>
      <input type="text" class="form-control" id="writer" placeholder="Enter Writer" name="writer">
    </div>
    
   <div class="form-group">
  		<label for="contents">Contents:</label>
  		<textarea class="form-control" rows="5" id="contents" name="contents"></textarea>
	</div>
    
    
    
    <button type="submit" class="btn btn-default">Write</button>
  </form>
</div>    