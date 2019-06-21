<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div class="col-lg-3">

	<h1 class="my-4">Category List</h1>
	<div class="list-group">

		<c:forEach var="c" items="${categoryList }">
			<a href="productByCategory${c.categoryId}" class="list-group-item">${c.categoryName }</a>
		</c:forEach>

	</div>

</div>
